package com.example.blog_app.model

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface CommentDao {


    @Query("SELECT * FROM post")
    fun observeContacts(): LiveData<List<Post>>

    @Insert
    fun insertComment(comment: Comment)
}