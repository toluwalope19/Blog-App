package com.example.blog_app.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000b0\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/blog_app/model/PostLocalDataSource;", "Lcom/example/blog_app/model/PostDataSource;", "postDao", "Lcom/example/blog_app/model/PostDao;", "(Lcom/example/blog_app/model/PostDao;)V", "deletePost", "", "post", "Lcom/example/blog_app/model/Post;", "getPosts", "Landroidx/lifecycle/LiveData;", "", "context", "Landroid/content/Context;", "observePosts", "savePost", "updatePost", "app_debug"})
public final class PostLocalDataSource implements com.example.blog_app.model.PostDataSource {
    private final com.example.blog_app.model.PostDao postDao = null;
    
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
    
    public PostLocalDataSource(@org.jetbrains.annotations.NotNull()
    com.example.blog_app.model.PostDao postDao) {
        super();
    }
}