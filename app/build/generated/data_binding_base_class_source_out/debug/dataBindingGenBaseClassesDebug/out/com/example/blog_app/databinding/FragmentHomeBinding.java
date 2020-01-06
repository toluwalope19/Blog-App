// Generated by data binding compiler. Do not edit!
package com.example.blog_app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.example.blog_app.R;
import com.example.blog_app.model.Post;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentHomeBinding extends ViewDataBinding {
  @NonNull
  public final ImageView LogOut;

  @NonNull
  public final TextView dateToday;

  @NonNull
  public final FloatingActionButton fab;

  @NonNull
  public final RecyclerView recyclerViewHome;

  @NonNull
  public final ViewPager2 viewPager;

  @Bindable
  protected Post mPost;

  protected FragmentHomeBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView LogOut, TextView dateToday, FloatingActionButton fab, RecyclerView recyclerViewHome,
      ViewPager2 viewPager) {
    super(_bindingComponent, _root, _localFieldCount);
    this.LogOut = LogOut;
    this.dateToday = dateToday;
    this.fab = fab;
    this.recyclerViewHome = recyclerViewHome;
    this.viewPager = viewPager;
  }

  public abstract void setPost(@Nullable Post post);

  @Nullable
  public Post getPost() {
    return mPost;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.home_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentHomeBinding>inflateInternal(inflater, R.layout.home_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.home_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentHomeBinding>inflateInternal(inflater, R.layout.home_fragment, null, false, component);
  }

  public static FragmentHomeBinding bind(@NonNull View view) {
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
  public static FragmentHomeBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentHomeBinding)bind(component, view, R.layout.home_fragment);
  }
}