package com.example.blog_app.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001c\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00072\u0006\u0010\t\u001a\u00020\nH&J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\b0\u00072\u0006\u0010\t\u001a\u00020\nH&J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0013"}, d2 = {"Lcom/example/blog_app/model/PostDataSource;", "", "deletePost", "", "post", "Lcom/example/blog_app/model/Post;", "getPosts", "Landroidx/lifecycle/LiveData;", "", "context", "Landroid/content/Context;", "getPostsAndComments", "Lcom/example/blog_app/model/PostWithComments;", "observePosts", "saveComment", "comment", "Lcom/example/blog_app/model/Comment;", "savePost", "updatePost", "app_debug"})
public abstract interface PostDataSource {
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.blog_app.model.Post>> observePosts();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.blog_app.model.Post>> getPosts(@org.jetbrains.annotations.NotNull()
    android.content.Context context);
    
    public abstract void savePost(@org.jetbrains.annotations.NotNull()
    com.example.blog_app.model.Post post);
    
    public abstract void updatePost(@org.jetbrains.annotations.NotNull()
    com.example.blog_app.model.Post post);
    
    public abstract void deletePost(@org.jetbrains.annotations.NotNull()
    com.example.blog_app.model.Post post);
    
    public abstract void saveComment(@org.jetbrains.annotations.NotNull()
    com.example.blog_app.model.Comment comment);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.blog_app.model.PostWithComments>> getPostsAndComments(@org.jetbrains.annotations.NotNull()
    android.content.Context context);
}