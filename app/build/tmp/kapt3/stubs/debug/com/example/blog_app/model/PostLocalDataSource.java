package com.example.blog_app.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r0\fH\u0016J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/blog_app/model/PostLocalDataSource;", "Lcom/example/blog_app/model/PostDataSource;", "postDao", "Lcom/example/blog_app/model/PostDao;", "commentDao", "Lcom/example/blog_app/model/CommentDao;", "(Lcom/example/blog_app/model/PostDao;Lcom/example/blog_app/model/CommentDao;)V", "deletePost", "", "post", "Lcom/example/blog_app/model/Post;", "getPosts", "Landroidx/lifecycle/LiveData;", "", "context", "Landroid/content/Context;", "getPostsAndComments", "Lcom/example/blog_app/model/PostWithComments;", "observePosts", "saveComment", "comment", "Lcom/example/blog_app/model/Comment;", "savePost", "updatePost", "app_debug"})
public final class PostLocalDataSource implements com.example.blog_app.model.PostDataSource {
    private final com.example.blog_app.model.PostDao postDao = null;
    private final com.example.blog_app.model.CommentDao commentDao = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.example.blog_app.model.Post>> observePosts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.example.blog_app.model.Post>> getPosts(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @java.lang.Override()
    public void savePost(@org.jetbrains.annotations.NotNull()
    com.example.blog_app.model.Post post) {
    }
    
    @java.lang.Override()
    public void updatePost(@org.jetbrains.annotations.NotNull()
    com.example.blog_app.model.Post post) {
    }
    
    @java.lang.Override()
    public void deletePost(@org.jetbrains.annotations.NotNull()
    com.example.blog_app.model.Post post) {
    }
    
    @java.lang.Override()
    public void saveComment(@org.jetbrains.annotations.NotNull()
    com.example.blog_app.model.Comment comment) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.example.blog_app.model.PostWithComments>> getPostsAndComments(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public PostLocalDataSource(@org.jetbrains.annotations.NotNull()
    com.example.blog_app.model.PostDao postDao, @org.jetbrains.annotations.NotNull()
    com.example.blog_app.model.CommentDao commentDao) {
        super();
    }
}