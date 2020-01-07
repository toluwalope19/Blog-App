package com.example.blog_app.model

import android.content.Context
import androidx.lifecycle.LiveData

class PostLocalDataSource internal constructor(private val postDao: PostDao, private val commentDao: CommentDao) : PostDataSource{
    override fun observePosts(): LiveData<List<Post>> {
        return postDao.observeContacts()
    }

    override fun getPosts(context: Context): LiveData<List<Post>> {
        return postDao.fetchContact()
    }

    override fun savePost(post: Post) {
        return postDao.insertContact(post)
    }

    override fun updatePost(post: Post) {
       return postDao.updateContact(post)
    }

    override fun deletePost(post: Post) {
        return postDao.deleteContact(post)
    }

    override fun saveComment(comment: Comment) {
        return commentDao.insertComment(comment)
    }

    override fun getPostsAndComments(context: Context): LiveData<List<PostWithComments>> {
        return postDao.getPostsandComments()
    }
}