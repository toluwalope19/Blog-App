package com.example.blog_app.model

import androidx.room.Embedded
import androidx.room.Relation

class PostWithComments (
    @Embedded val post: Post,
    @Relation(
        parentColumn = "id",
        entityColumn = "commentId"
    )
    val comments : List<Comment>
)