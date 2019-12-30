package com.example.blog_app.model

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface PostDao {

    @Query("SELECT * FROM post")
    fun observeContacts(): LiveData<List<Post>>

    @Insert
    fun insertContact(post: Post)

    @Update
    fun updateContact(post: Post)


    @Query("SELECT * FROM post")
    fun fetchContact(): LiveData<List<Post>>

    @Delete
    fun deleteContact(post: Post)

}