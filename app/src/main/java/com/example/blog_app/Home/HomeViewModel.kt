package com.example.blog_app.Home

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.blog_app.model.Post
import com.example.blog_app.model.PostRepository

class HomeViewModel(application: Application) : AndroidViewModel(application) {

    private val postRepository = PostRepository.getRepository(application)


    fun getPosts(context: Context): LiveData<List<Post>> {
        return postRepository.getPosts(context)
    }

    fun updatePosts(post: Post){
        return postRepository.updatePost(post)
    }

}
