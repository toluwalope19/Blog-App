package com.example.blog_app.addPost

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.blog_app.model.Post
import com.example.blog_app.model.PostRepository

class AddPostViewModel(application: Application) : AndroidViewModel(application) {

    private val postRepository =PostRepository.getRepository(application)

//    private val posts: MutableLiveData<List<Post>> by lazy {
//        MutableLiveData<List<Post>>().also {
//            loadPosts()
//        }
//    }

    fun savePost(post: Post){
        postRepository.savePost(post)
    }
}
