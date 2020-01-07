package com.example.blog_app.model

import android.app.Application
import android.content.Context
import androidx.lifecycle.LiveData
import androidx.room.Room
import kotlinx.coroutines.*

class PostRepository private constructor(application: Application){

    private val postLocalDataSource : PostDataSource
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO

    companion object {
        @Volatile
        private var INSTANCE: PostRepository? = null

        fun getRepository(app: Application): PostRepository {
            return INSTANCE ?: synchronized(this) {
                PostRepository(app).also {
                    INSTANCE = it
                }
            }
        }
    }

    init {
        val database = Room.databaseBuilder(application.applicationContext,
            PostDB::class.java, "Posts.db")
            .allowMainThreadQueries().build()
        postLocalDataSource = PostLocalDataSource(database.PostDao(), database.CommentDao())

    }

     fun observePosts(): LiveData<List<Post>> {
        return postLocalDataSource.observePosts()
    }

     fun getPosts(context: Context): LiveData<List<Post>> {
        return postLocalDataSource.getPosts(context)
    }

    fun getPostsWithComments(context: Context):LiveData<List<PostWithComments>>{
        return postLocalDataSource.getPostsAndComments(context)
    }


    suspend fun savePost(post: Post) {
        coroutineScope {
            launch {postLocalDataSource.savePost(post)  }
        }

    }

   suspend fun updatePost(post: Post){
       coroutineScope {
           launch {postLocalDataSource.updatePost(post) }
       }

    }

    suspend fun deletePost(post: Post) {
        coroutineScope {
            launch { postLocalDataSource.deletePost(post) }
        }
    }
    suspend fun insertComment(comment: Comment){
        coroutineScope {
            launch {
                postLocalDataSource.saveComment(comment)
            }
        }
    }
}