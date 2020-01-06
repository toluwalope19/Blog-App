package com.example.blog_app.Home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010$\u001a\u00020\u000fH\u0016J\u0018\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u000fH\u0016J\u0018\u0010)\u001a\u00020\u00022\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u000fH\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017\u00a8\u0006."}, d2 = {"Lcom/example/blog_app/Home/HomeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/blog_app/Home/HomeAdapter$HomeHolder;", "onItemClickListener", "Lcom/example/blog_app/model/OnItemClickListener;", "context", "Landroid/content/Context;", "model", "Lcom/example/blog_app/Home/HomeViewModel;", "(Lcom/example/blog_app/model/OnItemClickListener;Landroid/content/Context;Lcom/example/blog_app/Home/HomeViewModel;)V", "androidColors", "", "getContext", "()Landroid/content/Context;", "counter", "", "getCounter", "()I", "setCounter", "(I)V", "getModel", "()Lcom/example/blog_app/Home/HomeViewModel;", "setModel", "(Lcom/example/blog_app/Home/HomeViewModel;)V", "getOnItemClickListener", "()Lcom/example/blog_app/model/OnItemClickListener;", "posts", "", "Lcom/example/blog_app/model/Post;", "getPosts", "()Ljava/util/List;", "setPosts", "(Ljava/util/List;)V", "viewModel", "getViewModel", "setViewModel", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "HomeHolder", "app_debug"})
public final class HomeAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.blog_app.Home.HomeAdapter.HomeHolder> {
    private final int[] androidColors = null;
    private int counter;
    @org.jetbrains.annotations.NotNull()
    public com.example.blog_app.Home.HomeViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.blog_app.model.Post> posts;
    @org.jetbrains.annotations.NotNull()
    private final com.example.blog_app.model.OnItemClickListener onItemClickListener = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private com.example.blog_app.Home.HomeViewModel model;
    
    public final int getCounter() {
        return 0;
    }
    
    public final void setCounter(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.blog_app.Home.HomeViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.example.blog_app.Home.HomeViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.blog_app.model.Post> getPosts() {
        return null;
    }
    
    public final void setPosts(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.blog_app.model.Post> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.blog_app.Home.HomeAdapter.HomeHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.blog_app.Home.HomeAdapter.HomeHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.blog_app.model.OnItemClickListener getOnItemClickListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.blog_app.Home.HomeViewModel getModel() {
        return null;
    }
    
    public final void setModel(@org.jetbrains.annotations.NotNull()
    com.example.blog_app.Home.HomeViewModel p0) {
    }
    
    public HomeAdapter(@org.jetbrains.annotations.NotNull()
    com.example.blog_app.model.OnItemClickListener onItemClickListener, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.example.blog_app.Home.HomeViewModel model) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u000e"}, d2 = {"Lcom/example/blog_app/Home/HomeAdapter$HomeHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/blog_app/databinding/HomePostRowBinding;", "(Lcom/example/blog_app/databinding/HomePostRowBinding;)V", "getBinding", "()Lcom/example/blog_app/databinding/HomePostRowBinding;", "setBinding", "bind", "", "post", "Lcom/example/blog_app/model/Post;", "onItemClickListener", "Lcom/example/blog_app/model/OnItemClickListener;", "app_debug"})
    public static final class HomeHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.example.blog_app.databinding.HomePostRowBinding binding;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.blog_app.model.Post post, @org.jetbrains.annotations.NotNull()
        com.example.blog_app.model.OnItemClickListener onItemClickListener) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.blog_app.databinding.HomePostRowBinding getBinding() {
            return null;
        }
        
        public final void setBinding(@org.jetbrains.annotations.NotNull()
        com.example.blog_app.databinding.HomePostRowBinding p0) {
        }
        
        public HomeHolder(@org.jetbrains.annotations.NotNull()
        com.example.blog_app.databinding.HomePostRowBinding binding) {
            super(null);
        }
    }
}