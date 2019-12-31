package com.example.blog_app.addPost

import android.R.*
import android.app.AlertDialog
import android.content.ContentResolver
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.ImageDecoder
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
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

import com.example.blog_app.R
import kotlinx.android.synthetic.main.add_post_fragment.*
import java.io.IOException
import android.widget.ArrayAdapter as ArrayAdapter

class AddPostFragment : Fragment() {

    private var img_Btn: Button? = null
    private var imageview: ImageView? = null
    private val GALLERY = 1
    private val CAMERA = 2


    companion object {
        fun newInstance() = AddPostFragment()
    }

    private lateinit var viewModel: AddPostViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.add_post_fragment, container, false)
        val imgBtn =view.findViewById<Button>(R.id.img_Btn)
        val imageView = view.findViewById<ImageView>(R.id.addImage)
        val edit = view.findViewById<EditText>(R.id.post)
        var categories = view.findViewById<EditText>(R.id.addCategory)
        val error1 =view.findViewById<TextView>(R.id.error1)




         fun showPictureDialog() {
            val pictureDialog = AlertDialog.Builder(context)
            pictureDialog.setTitle("Select Action")
            val pictureDialogItems = arrayOf("Select photo from gallery", "Capture photo from camera")
            pictureDialog.setItems(pictureDialogItems
            ) { dialog, which ->
                when (which) {
                    0 -> {
                        val galleryIntent = Intent(Intent.ACTION_PICK,
                            MediaStore.Images.Media.EXTERNAL_CONTENT_URI)

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




                addPost.setOnClickListener{ view ->

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

        return view

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(AddPostViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)


        if (requestCode == GALLERY)
        {
            if (data != null)
            {

                try
                {
                    val contentURI = data!!.data
                    Glide.with(context!!).load(contentURI).into(imageview!!)
                    imageview!!.setImageURI(contentURI)
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
            imageview!!.setImageBitmap(thumbnail)
            imageview!!.rotation = 90f
            Toast.makeText(context, "Image Saved!", Toast.LENGTH_SHORT).show()
        }
    }

}
