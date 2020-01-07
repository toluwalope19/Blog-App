package com.example.blog_app.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Entity(tableName = "comments")
@Parcelize
data class Comment (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "commentId")
    val postId:Int = 0,

    @ColumnInfo(name = "comment")
    val comment: String
): Parcelable {

}
