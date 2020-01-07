package com.example.blog_app.postDetail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/blog_app/postDetail/PostDetailViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "postRepository", "Lcom/example/blog_app/model/PostRepository;", "getPostsWithComments", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/blog_app/model/PostWithComments;", "context", "Landroid/content/Context;", "saveComment", "", "comment", "Lcom/example/blog_app/model/Comment;", "app_debug"})
public final class PostDetailViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.example.blog_app.model.PostRepository postRepository = null;
    
    public final void saveComment(@org.jetbrains.annotations.NotNull()
    com.example.blog_app.model.Comment comment) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.blog_app.model.PostWithComments>> getPostsWithComments(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public PostDetailViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}