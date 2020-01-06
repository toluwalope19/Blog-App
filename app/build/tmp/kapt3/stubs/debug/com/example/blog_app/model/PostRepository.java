package com.example.blog_app.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r0\fJ\u000e\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/blog_app/model/PostRepository;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "postLocalDataSource", "Lcom/example/blog_app/model/PostDataSource;", "deletePost", "", "post", "Lcom/example/blog_app/model/Post;", "getPosts", "Landroidx/lifecycle/LiveData;", "", "context", "Landroid/content/Context;", "observePosts", "savePost", "updatePost", "Companion", "app_debug"})
public final class PostRepository {
    private final com.example.blog_app.model.PostDataSource postLocalDataSource = null;
    private static volatile com.example.blog_app.model.PostRepository INSTANCE;
    public static final com.example.blog_app.model.PostRepository.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.blog_app.model.Post>> observePosts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.blog_app.model.Post>> getPosts(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public final void savePost(@org.jetbrains.annotations.NotNull()
    com.example.blog_app.model.Post post) {
    }
    
    public final void updatePost(@org.jetbrains.annotations.NotNull()
    com.example.blog_app.model.Post post) {
    }
    
    public final void deletePost(@org.jetbrains.annotations.NotNull()
    com.example.blog_app.model.Post post) {
    }
    
    private PostRepository(android.app.Application application) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/example/blog_app/model/PostRepository$Companion;", "", "()V", "INSTANCE", "Lcom/example/blog_app/model/PostRepository;", "getRepository", "app", "Landroid/app/Application;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.blog_app.model.PostRepository getRepository(@org.jetbrains.annotations.NotNull()
        android.app.Application app) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}