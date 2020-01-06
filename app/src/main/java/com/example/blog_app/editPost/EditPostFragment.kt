package com.example.blog_app.editPost

import android.Manifest.permission.CAMERA
import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.opengl.Visibility
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
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.blog_app.R
import com.example.blog_app.databinding.EditPostFragmentBinding
import com.example.blog_app.model.Post
import kotlinx.android.synthetic.main.add_post_fragment.*
import kotlinx.android.synthetic.main.edit_post_fragment.*
import java.io.ByteArrayOutputStream
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*


class EditPostFragment : Fragment() {

    private val GALLERY = 1
    private val CAMERA = 2
    private var imageUriLoader: Uri? = null


    companion object {
        fun newInstance() = EditPostFragment()
    }
    private var incomingPost : Post? = null
    private val body = view?.findViewById<EditText>(R.id.editPost)
    val categories = view?.findViewById<EditText>(R.id.editCategory)
    var title = view?.findViewById<EditText>(R.id.editPostTitle)

    val error1 =view?.findViewById<TextView>(R.id.error1)

    val args : EditPostFragmentArgs by navArgs()



    private lateinit var viewModel: EditPostViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding =   EditPostFragmentBinding.inflate(inflater, container, false)
        val changeImage = binding.changeImage
         val editPost =  binding.editSubmitPost
        binding.posts = args.post

         val imageView = binding.editImage
        imageView.visibility = View.VISIBLE


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
        changeImage?.setOnClickListener { showPictureDialog() }



        editPost?.setOnClickListener{ view ->

//                    if(categories?.text!!.isEmpty()){
//                        error1?.visibility= View.VISIBLE
////                        option.setBackgroundResource(R.drawable.edittexterror)
//                    }else{
//
//                        error1?.visibility= View.GONE
//                    }
////
//                    if(body?.text!!.isEmpty()){
//                        error1?.visibility= View.VISIBLE
////                        edit.setBackgroundResource(R.drawable.edittexterror)
//                    }else{
//                        error1?.visibility = View.GONE
            val sdf = SimpleDateFormat("HH:mm" )
            val currentDate = sdf.format(Date())
            currentDate.toString()
//                    }

                var title = binding.editPostTitle.text.toString()
                var category = binding.editCategory.text.toString()
                var post = binding.editPost.text.toString()
                var image = imageUriLoader.toString()



           val updatedPost = Post(0,title,category,post,currentDate,0,image)

                if(incomingPost == null){
                    viewModel.savePost(updatedPost)
                }else{
                  updatedPost.id = incomingPost!!.id
                    viewModel.updatePost(updatedPost)
                }





            val action = EditPostFragmentDirections.actionEditPostFragmentToHomeFragment()
            findNavController().navigate(action)
                }

                body?.addTextChangedListener(object : TextWatcher {
                    override fun afterTextChanged(s : Editable?){}
                    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                    }
                    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                        error1?.visibility = View.GONE
                        body.setBackgroundResource(R.drawable.edittext)

                    }
                })

        binding.lifecycleOwner = this.viewLifecycleOwner
        return binding.root

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        viewModel = ViewModelProviders.of(this).get(EditPostViewModel::class.java)
        // TODO: Use the ViewModel
        val imageView = view?.findViewById<ImageView>(R.id.editImage)


            arguments?.let {
                incomingPost = EditPostFragmentArgs.fromBundle(it).post
                title?.setText(incomingPost?.title)
                categories?.setText(incomingPost?.category)
                body?.setText(incomingPost?.post)
                val imageUri = Uri.parse(incomingPost?.image)
                Glide.with(context!!).load(imageUri).into(imageView!!)
            }



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
    private fun getImageUriFromBitmap(inContext: Context, inImage : Bitmap): Uri{
        val bytes = ByteArrayOutputStream()
        inImage.compress(Bitmap.CompressFormat.JPEG, 100, bytes)
        val path = MediaStore.Images.Media.insertImage(inContext.getContentResolver(), inImage, "Title", null)
        return Uri.parse(path)

    }

}
