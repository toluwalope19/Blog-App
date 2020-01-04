package com.example.blog_app.addPost;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.NavArgs;
import com.example.blog_app.model.Post;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class AddPostFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private AddPostFragmentArgs() {
  }

  private AddPostFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static AddPostFragmentArgs fromBundle(@NonNull Bundle bundle) {
    AddPostFragmentArgs __result = new AddPostFragmentArgs();
    bundle.setClassLoader(AddPostFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("post")) {
      Post post;
      if (Parcelable.class.isAssignableFrom(Post.class) || Serializable.class.isAssignableFrom(Post.class)) {
        post = (Post) bundle.get("post");
      } else {
        throw new UnsupportedOperationException(Post.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      __result.arguments.put("post", post);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @Nullable
  public Post getPost() {
    return (Post) arguments.get("post");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("post")) {
      Post post = (Post) arguments.get("post");
      if (Parcelable.class.isAssignableFrom(Post.class) || post == null) {
        __result.putParcelable("post", Parcelable.class.cast(post));
      } else if (Serializable.class.isAssignableFrom(Post.class)) {
        __result.putSerializable("post", Serializable.class.cast(post));
      } else {
        throw new UnsupportedOperationException(Post.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    AddPostFragmentArgs that = (AddPostFragmentArgs) object;
    if (arguments.containsKey("post") != that.arguments.containsKey("post")) {
      return false;
    }
    if (getPost() != null ? !getPost().equals(that.getPost()) : that.getPost() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getPost() != null ? getPost().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "AddPostFragmentArgs{"
        + "post=" + getPost()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(AddPostFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder() {
    }

    @NonNull
    public AddPostFragmentArgs build() {
      AddPostFragmentArgs result = new AddPostFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setPost(@Nullable Post post) {
      this.arguments.put("post", post);
      return this;
    }

    @SuppressWarnings("unchecked")
    @Nullable
    public Post getPost() {
      return (Post) arguments.get("post");
    }
  }
}
