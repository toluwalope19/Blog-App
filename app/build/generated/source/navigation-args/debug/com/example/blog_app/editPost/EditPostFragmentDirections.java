package com.example.blog_app.editPost;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.NavDirections;
import com.example.blog_app.R;
import com.example.blog_app.model.Post;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class EditPostFragmentDirections {
  private EditPostFragmentDirections() {
  }

  @NonNull
  public static ActionEditPostFragmentToHomeFragment actionEditPostFragmentToHomeFragment() {
    return new ActionEditPostFragmentToHomeFragment();
  }

  public static class ActionEditPostFragmentToHomeFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionEditPostFragmentToHomeFragment() {
    }

    @NonNull
    public ActionEditPostFragmentToHomeFragment setPost(@Nullable Post post) {
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
      return R.id.action_editPostFragment_to_homeFragment;
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
      ActionEditPostFragmentToHomeFragment that = (ActionEditPostFragmentToHomeFragment) object;
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
      return "ActionEditPostFragmentToHomeFragment(actionId=" + getActionId() + "){"
          + "post=" + getPost()
          + "}";
    }
  }
}
