package com.example.blog_app.favorites

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.blog_app.model.Post
import com.example.blog_app.model.PostRepository

class FavouritesViewModel(application: Application) : AndroidViewModel(application) {


    private val postRepository =PostRepository.getRepository(application)


    fun getPosts(context: Context): LiveData<List<Post>> {
        return postRepository.getPosts(context)
    }

    fun updatePosts(post: Post){
        return postRepository.updatePos(post)
    }

}
