package com.example.blog_app.addPost

import android.R.*
import android.app.AlertDialog
import android.content.ContentResolver
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.ImageDecoder
import android.net.Uri
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.provider.MediaStore
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.graphics.drawable.toBitmap
import androidx.databinding.BindingAdapter
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.blog_app.Home.HomeFragment

import com.example.blog_app.R
import com.example.blog_app.databinding.AddPostFragmentBinding
import com.example.blog_app.databinding.AddPostFragmentBindingImpl
import com.example.blog_app.editPost.EditPostFragmentDirections
import com.example.blog_app.model.Post
import com.example.blog_app.postDetail.PostDetailFragment
import kotlinx.android.synthetic.main.add_post_fragment.*
import java.io.ByteArrayOutputStream
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*
import android.widget.ArrayAdapter as ArrayAdapter

class AddPostFragment : Fragment() {

    private var img_Btn: Button? = null
    private var imageview: ImageView? = null
    private val GALLERY = 1
    private val CAMERA = 2
    private var imageUriLoader: Uri? = null


    companion object {
        fun newInstance() = AddPostFragment()
    }

    private lateinit var viewModel: AddPostViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = AddPostFragmentBinding.inflate(inflater,container,false)
        val imgBtn = binding.imgBtn
        val imageView = binding.addImage
        val edit = binding.post
        var categories = binding.addCategory
        val error1 =binding.error1



    ///To show picture dialog
         fun showPictureDialog() {
            val pictureDialog = AlertDialog.Builder(context)
            pictureDialog.setTitle("Select Action")
            val pictureDialogItems = arrayOf("Select photo from gallery", "Capture photo from camera")
            pictureDialog.setItems(pictureDialogItems
            ) { dialog, which ->
                when (which) {
                    0 -> {
                        val galleryIntent = Intent(Intent.ACTION_OPEN_DOCUMENT)
                        galleryIntent.type="image/*"
                        galleryIntent.addCategory(Intent.CATEGORY_OPENABLE)
                        val mimeTypes = arrayOf("image/jpeg", "image/png")
                        galleryIntent.putExtra(Intent.EXTRA_MIME_TYPES,mimeTypes)

                        startActivityForResult(galleryIntent, GALLERY)
                    }
                    1 -> {
                        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                        startActivityForResult(intent, CAMERA)
                    }
                }
            }
            pictureDialog.show()
        }
        imgBtn.setOnClickListener { showPictureDialog() }



        //////To add New Post
                binding.addPost.setOnClickListener{ view ->

                    val sdf = SimpleDateFormat("HH:mm" )
                    val currentDate = sdf.format(Date())
                    currentDate.toString()

                    val title = binding.addPostTitle.text.toString()
                    val category = binding.addCategory.text.toString()
                    val body = binding.post.text.toString()
                    val image = binding.addImage.drawable.toBitmap()


                    val capturedPost = Post(0,title,category,body,currentDate,imageUriLoader.toString())

                    viewModel.savePost(capturedPost)

                    val action = AddPostFragmentDirections.actionAddPostFragmentToHomeFragment()
                    findNavController().navigate(action)

                    if(categories.text.isEmpty()){
                        error1.visibility= View.VISIBLE
//                        option.setBackgroundResource(R.drawable.edittexterror)
                    }else{

                        error1.visibility= View.GONE
                    }
//
                    if(edit.text.isEmpty()){
                        error1.visibility= View.VISIBLE
//                        edit.setBackgroundResource(R.drawable.edittexterror)
                    }else{
                        error1.visibility = View.GONE
                    }
                }

                edit.addTextChangedListener(object : TextWatcher {
                    override fun afterTextChanged(s : Editable?){}
                    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                    }
                    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                        error1.visibility = View.GONE
                        edit.setBackgroundResource(R.drawable.edittext)

                    }
                })

        binding.lifecycleOwner = this.viewLifecycleOwner
        return binding.root

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(AddPostViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)


        val imageView = view?.findViewById<ImageView>(R.id.addImage)

        if (requestCode == GALLERY)
        {
            if (data != null)
            {

                try
                {
                    val contentURI = data!!.data
                    imageUriLoader = contentURI
                    Glide.with(context!!).load(contentURI).into(imageView!!)
                    imageView.setImageURI(contentURI)
                    Toast.makeText(context, "Image Saved!", Toast.LENGTH_SHORT).show()
                }
                catch (e: IOException) {
                    e.printStackTrace()
                    Toast.makeText(context, "Failed!", Toast.LENGTH_SHORT).show()
                }
            }
        }
        else if (requestCode == CAMERA)
        {
            val thumbnail = data!!.extras!!.get("data") as Bitmap
            imageView!!.setImageBitmap(thumbnail)
            imageView!!.rotation = 90f
            imageUriLoader = getImageUriFromBitmap(context!!,thumbnail)
            Toast.makeText(context, "Image Saved!", Toast.LENGTH_SHORT).show()
        }
    }

//To get image Uri from Bitmap
    private fun getImageUriFromBitmap(inContext: Context,inImage : Bitmap): Uri{
        val bytes = ByteArrayOutputStream()
        inImage.compress(Bitmap.CompressFormat.JPEG, 100, bytes)
        val path = MediaStore.Images.Media.insertImage(inContext.getContentResolver(), inImage, "Title", null)
        return Uri.parse(path)

    }

}
