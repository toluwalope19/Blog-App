package com.example.blog_app.editPost

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.blog_app.model.Post
import com.example.blog_app.model.PostRepository
import kotlinx.coroutines.launch

class EditPostViewModel(application: Application) : AndroidViewModel(application) {

    private val postRepository = PostRepository.getRepository(application)


    fun updatePost(post: Post){
        viewModelScope.launch {
            postRepository.updatePost(post)
        }

    }
    fun savePost(post: Post){
        viewModelScope.launch {
            postRepository.savePost(post)
        }

    }

}
