package com.example.blog_app.model

import android.content.Context
import androidx.lifecycle.LiveData

interface PostDataSource {

    fun observePosts(): LiveData<List<Post>>

    fun getPosts(context: Context): LiveData<List<Post>>

//     fun getContact(contact: Contact): Result<Contact>

    fun savePost(post: Post)

    fun updatePost(post: Post)


    fun deletePost(post: Post)
}