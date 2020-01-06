package com.example.blog_app.Home;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.blog_app.R;
import com.example.blog_app.model.Post;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class HomeFragmentDirections {
  private HomeFragmentDirections() {
  }

  @NonNull
  public static ActionHomeFragmentToEditPostFragment actionHomeFragmentToEditPostFragment() {
    return new ActionHomeFragmentToEditPostFragment();
  }

  @NonNull
  public static ActionHomeFragmentToPostPagerDetailFragment actionHomeFragmentToPostPagerDetailFragment(@NonNull Post post) {
    return new ActionHomeFragmentToPostPagerDetailFragment(post);
  }

  @NonNull
  public static ActionHomeFragmentToAddPostFragment actionHomeFragmentToAddPostFragment() {
    return new ActionHomeFragmentToAddPostFragment();
  }

  @NonNull
  public static ActionHomeFragmentToPostDetailFragment actionHomeFragmentToPostDetailFragment(@NonNull Post post) {
    return new ActionHomeFragmentToPostDetailFragment(post);
  }

  @NonNull
  public static NavDirections actionHomeFragmentToProfileFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeFragment_to_profileFragment);
  }

  @NonNull
  public static ActionHomeFragmentToAddPostFragment2 actionHomeFragmentToAddPostFragment2() {
    return new ActionHomeFragmentToAddPostFragment2();
  }

  public static class ActionHomeFragmentToEditPostFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionHomeFragmentToEditPostFragment() {
    }

    @NonNull
    public ActionHomeFragmentToEditPostFragment setPost(@Nullable Post post) {
      this.arguments.put("post", post);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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
    public int getActionId() {
      return R.id.action_homeFragment_to_editPostFragment;
    }

    @SuppressWarnings("unchecked")
    @Nullable
    public Post getPost() {
      return (Post) arguments.get("post");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionHomeFragmentToEditPostFragment that = (ActionHomeFragmentToEditPostFragment) object;
      if (arguments.containsKey("post") != that.arguments.containsKey("post")) {
        return false;
      }
      if (getPost() != null ? !getPost().equals(that.getPost()) : that.getPost() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getPost() != null ? getPost().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionHomeFragmentToEditPostFragment(actionId=" + getActionId() + "){"
          + "post=" + getPost()
          + "}";
    }
  }

  public static class ActionHomeFragmentToPostPagerDetailFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionHomeFragmentToPostPagerDetailFragment(@NonNull Post post) {
      if (post == null) {
        throw new IllegalArgumentException("Argument \"post\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("post", post);
    }

    @NonNull
    public ActionHomeFragmentToPostPagerDetailFragment setPost(@NonNull Post post) {
      if (post == null) {
        throw new IllegalArgumentException("Argument \"post\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("post", post);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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
    public int getActionId() {
      return R.id.action_homeFragment_to_postPagerDetailFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Post getPost() {
      return (Post) arguments.get("post");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionHomeFragmentToPostPagerDetailFragment that = (ActionHomeFragmentToPostPagerDetailFragment) object;
      if (arguments.containsKey("post") != that.arguments.containsKey("post")) {
        return false;
      }
      if (getPost() != null ? !getPost().equals(that.getPost()) : that.getPost() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getPost() != null ? getPost().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionHomeFragmentToPostPagerDetailFragment(actionId=" + getActionId() + "){"
          + "post=" + getPost()
          + "}";
    }
  }

  public static class ActionHomeFragmentToAddPostFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionHomeFragmentToAddPostFragment() {
    }

    @NonNull
    public ActionHomeFragmentToAddPostFragment setPost(@Nullable Post post) {
      this.arguments.put("post", post);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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
    public int getActionId() {
      return R.id.action_homeFragment_to_addPostFragment;
    }

    @SuppressWarnings("unchecked")
    @Nullable
    public Post getPost() {
      return (Post) arguments.get("post");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionHomeFragmentToAddPostFragment that = (ActionHomeFragmentToAddPostFragment) object;
      if (arguments.containsKey("post") != that.arguments.containsKey("post")) {
        return false;
      }
      if (getPost() != null ? !getPost().equals(that.getPost()) : that.getPost() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getPost() != null ? getPost().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionHomeFragmentToAddPostFragment(actionId=" + getActionId() + "){"
          + "post=" + getPost()
          + "}";
    }
  }

  public static class ActionHomeFragmentToPostDetailFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionHomeFragmentToPostDetailFragment(@NonNull Post post) {
      if (post == null) {
        throw new IllegalArgumentException("Argument \"post\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("post", post);
    }

    @NonNull
    public ActionHomeFragmentToPostDetailFragment setPost(@NonNull Post post) {
      if (post == null) {
        throw new IllegalArgumentException("Argument \"post\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("post", post);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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
    public int getActionId() {
      return R.id.action_homeFragment_to_postDetailFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Post getPost() {
      return (Post) arguments.get("post");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionHomeFragmentToPostDetailFragment that = (ActionHomeFragmentToPostDetailFragment) object;
      if (arguments.containsKey("post") != that.arguments.containsKey("post")) {
        return false;
      }
      if (getPost() != null ? !getPost().equals(that.getPost()) : that.getPost() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getPost() != null ? getPost().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionHomeFragmentToPostDetailFragment(actionId=" + getActionId() + "){"
          + "post=" + getPost()
          + "}";
    }
  }

  public static class ActionHomeFragmentToAddPostFragment2 implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionHomeFragmentToAddPostFragment2() {
    }

    @NonNull
    public ActionHomeFragmentToAddPostFragment2 setPost(@Nullable Post post) {
      this.arguments.put("post", post);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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
    public int getActionId() {
      return R.id.action_homeFragment_to_addPostFragment2;
    }

    @SuppressWarnings("unchecked")
    @Nullable
    public Post getPost() {
      return (Post) arguments.get("post");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionHomeFragmentToAddPostFragment2 that = (ActionHomeFragmentToAddPostFragment2) object;
      if (arguments.containsKey("post") != that.arguments.containsKey("post")) {
        return false;
      }
      if (getPost() != null ? !getPost().equals(that.getPost()) : that.getPost() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getPost() != null ? getPost().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionHomeFragmentToAddPostFragment2(actionId=" + getActionId() + "){"
          + "post=" + getPost()
          + "}";
    }
  }
}
