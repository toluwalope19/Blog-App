package com.example.blog_app.postDetail

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.blog_app.model.Comment
import com.example.blog_app.model.Post
import com.example.blog_app.model.PostRepository
import com.example.blog_app.model.PostWithComments
import kotlinx.coroutines.launch

class PostDetailViewModel(application: Application) : AndroidViewModel(application) {

    private val postRepository = PostRepository.getRepository(application)

    fun saveComment(comment: Comment){
        viewModelScope.launch { postRepository.insertComment(comment)
        }
    }
    fun getPostsWithComments(context: Context):LiveData<List<PostWithComments>>{
        return postRepository.getPostsWithComments(context)
    }
}
