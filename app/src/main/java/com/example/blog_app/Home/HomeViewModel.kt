package com.example.blog_app.Home

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.blog_app.model.Post
import com.example.blog_app.model.PostRepository
import com.example.blog_app.model.PostWithComments
import kotlinx.coroutines.launch

class HomeViewModel(application: Application) : AndroidViewModel(application) {

    private val postRepository = PostRepository.getRepository(application)


    fun getPosts(context: Context): LiveData<List<Post>> {
        return postRepository.getPosts(context)
    }

    fun deletePost(post: Post){
        viewModelScope.launch { postRepository.deletePost(post)
        }

    }

    fun getPostsWithComments(context: Context): LiveData<List<PostWithComments>>{
        return postRepository.getPostsWithComments(context)
    }


    }


