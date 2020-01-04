package com.example.blog_app.model

import android.net.Uri
import android.os.Parcelable
import android.widget.ImageView
import androidx.databinding.BindingAdapter
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
    var image: String
    ): Parcelable

        @BindingAdapter("android:src")
        fun setImageUri(view: ImageView, imageUri: Uri) {
            view.setImageURI(imageUri)
        }