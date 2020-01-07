package com.example.blog_app.postDetail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lcom/example/blog_app/postDetail/CommentAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/blog_app/postDetail/CommentAdapter$CommentHolder;", "()V", "comments", "", "Lcom/example/blog_app/model/Comment;", "getComments", "()Ljava/util/List;", "setComments", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CommentHolder", "app_debug"})
public final class CommentAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.blog_app.postDetail.CommentAdapter.CommentHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.blog_app.model.Comment> comments;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.blog_app.model.Comment> getComments() {
        return null;
    }
    
    public final void setComments(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.blog_app.model.Comment> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.blog_app.postDetail.CommentAdapter.CommentHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.blog_app.postDetail.CommentAdapter.CommentHolder holder, int position) {
    }
    
    public CommentAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\f"}, d2 = {"Lcom/example/blog_app/postDetail/CommentAdapter$CommentHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/blog_app/databinding/CommentRowBinding;", "(Lcom/example/blog_app/databinding/CommentRowBinding;)V", "getBinding", "()Lcom/example/blog_app/databinding/CommentRowBinding;", "setBinding", "bind", "", "comment", "Lcom/example/blog_app/model/Comment;", "app_debug"})
    public static final class CommentHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.example.blog_app.databinding.CommentRowBinding binding;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.blog_app.model.Comment comment) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.blog_app.databinding.CommentRowBinding getBinding() {
            return null;
        }
        
        public final void setBinding(@org.jetbrains.annotations.NotNull()
        com.example.blog_app.databinding.CommentRowBinding p0) {
        }
        
        public CommentHolder(@org.jetbrains.annotations.NotNull()
        com.example.blog_app.databinding.CommentRowBinding binding) {
            super(null);
        }
    }
}