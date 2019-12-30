package com.example.blog_app.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Entity(tableName = "post")
@Parcelize
data class Post ( @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Int = 0,

    @ColumnInfo(name = "title")
    var title: String,

    @ColumnInfo(name = "category")
    var category:String,

    @ColumnInfo(name = "post")
    var post: String,

    @ColumnInfo(name = "Image")
    var image: Int
    ): Parcelable