package com.example.blog_app.editPost

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.example.blog_app.model.Post
import com.example.blog_app.model.PostRepository

class EditPostViewModel(application: Application) : AndroidViewModel(application) {

    private val postRepository = PostRepository.getRepository(application)

    fun updatePost(post: Post){
        postRepository.updatePost(post)
    }
    fun savePost(post: Post){
        postRepository.savePost(post)
    }
}
