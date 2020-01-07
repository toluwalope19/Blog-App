// Generated by data binding compiler. Do not edit!
package com.example.blog_app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.example.blog_app.R;
import com.example.blog_app.model.Post;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentPostPagerDetailBinding extends ViewDataBinding {
  @NonNull
  public final TextView detailCategory;

  @NonNull
  public final ImageView detailImage;

  @NonNull
  public final TextView detailTitle;

  @NonNull
  public final EditText newComment;

  @NonNull
  public final TextView postDetail;

  @NonNull
  public final RecyclerView recyclerComment;

  @NonNull
  public final ImageView sendComment;

  @NonNull
  public final Toolbar toolbar;

  @Bindable
  protected Post mPosts;

  protected FragmentPostPagerDetailBinding(Object _bindingComponent, View _root,
      int _localFieldCount, TextView detailCategory, ImageView detailImage, TextView detailTitle,
      EditText newComment, TextView postDetail, RecyclerView recyclerComment, ImageView sendComment,
      Toolbar toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.detailCategory = detailCategory;
    this.detailImage = detailImage;
    this.detailTitle = detailTitle;
    this.newComment = newComment;
    this.postDetail = postDetail;
    this.recyclerComment = recyclerComment;
    this.sendComment = sendComment;
    this.toolbar = toolbar;
  }

  public abstract void setPosts(@Nullable Post posts);

  @Nullable
  public Post getPosts() {
    return mPosts;
  }

  @NonNull
  public static FragmentPostPagerDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_post_pager_detail, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentPostPagerDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentPostPagerDetailBinding>inflateInternal(inflater, R.layout.fragment_post_pager_detail, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentPostPagerDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_post_pager_detail, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentPostPagerDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentPostPagerDetailBinding>inflateInternal(inflater, R.layout.fragment_post_pager_detail, null, false, component);
  }

  public static FragmentPostPagerDetailBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentPostPagerDetailBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (FragmentPostPagerDetailBinding)bind(component, view, R.layout.fragment_post_pager_detail);
  }
}
