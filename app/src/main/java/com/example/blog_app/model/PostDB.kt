package com.example.blog_app.model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Post::class],version = 1)
abstract class PostDB : RoomDatabase() {

    abstract fun PostDao() : PostDao

    companion object{

        private var instance: PostDB? = null
        fun createDB( context: Context): PostDB {


            if(instance == null){
                instance = Room.databaseBuilder(context,
                    PostDB::class.java,"Data").allowMainThreadQueries().build()
                return instance!!

            }
            return instance!!
        }


    }
}