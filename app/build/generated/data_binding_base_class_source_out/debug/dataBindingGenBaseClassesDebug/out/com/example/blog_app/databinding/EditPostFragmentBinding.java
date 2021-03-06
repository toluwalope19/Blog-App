// Generated by data binding compiler. Do not edit!
package com.example.blog_app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.blog_app.R;
import com.example.blog_app.model.Post;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class EditPostFragmentBinding extends ViewDataBinding {
  @NonNull
  public final Button changeImage;

  @NonNull
  public final EditText editCategory;

  @NonNull
  public final ImageView editImage;

  @NonNull
  public final EditText editPost;

  @NonNull
  public final EditText editPostTitle;

  @NonNull
  public final Button editSubmitPost;

  @NonNull
  public final TextView error1;

  @Bindable
  protected Post mPosts;

  protected EditPostFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button changeImage, EditText editCategory, ImageView editImage, EditText editPost,
      EditText editPostTitle, Button editSubmitPost, TextView error1) {
    super(_bindingComponent, _root, _localFieldCount);
    this.changeImage = changeImage;
    this.editCategory = editCategory;
    this.editImage = editImage;
    this.editPost = editPost;
    this.editPostTitle = editPostTitle;
    this.editSubmitPost = editSubmitPost;
    this.error1 = error1;
  }

  public abstract void setPosts(@Nullable Post posts);

  @Nullable
  public Post getPosts() {
    return mPosts;
  }

  @NonNull
  public static EditPostFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.edit_post_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static EditPostFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<EditPostFragmentBinding>inflateInternal(inflater, R.layout.edit_post_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static EditPostFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.edit_post_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static EditPostFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<EditPostFragmentBinding>inflateInternal(inflater, R.layout.edit_post_fragment, null, false, component);
  }

  public static EditPostFragmentBinding bind(@NonNull View view) {
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
  public static EditPostFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (EditPostFragmentBinding)bind(component, view, R.layout.edit_post_fragment);
  }
}
