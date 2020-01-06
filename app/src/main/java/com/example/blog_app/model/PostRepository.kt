package com.example.blog_app.model

import android.app.Application
import android.content.Context
import androidx.lifecycle.LiveData
import androidx.room.Room

class PostRepository private constructor(application: Application){

    private val postLocalDataSource : PostDataSource

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
        postLocalDataSource = PostLocalDataSource(database.PostDao())
    }

     fun observePosts(): LiveData<List<Post>> {
        return postLocalDataSource.observePosts()
    }

     fun getPosts(context: Context): LiveData<List<Post>> {
        return postLocalDataSource.getPosts(context)
    }


     fun savePost(post: Post)  {
        return postLocalDataSource.savePost(post)
    }

    fun updatePost(post: Post){
        return postLocalDataSource.updatePost(post)
    }



     fun deletePost(post: Post) {
        return postLocalDataSource.deletePost(post)
    }
}