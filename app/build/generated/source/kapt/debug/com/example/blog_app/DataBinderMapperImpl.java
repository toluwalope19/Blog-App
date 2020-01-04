package com.example.blog_app;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.blog_app.databinding.AddPostFragmentBindingImpl;
import com.example.blog_app.databinding.CardRowBindingImpl;
import com.example.blog_app.databinding.EditPostFragmentBindingImpl;
import com.example.blog_app.databinding.FragmentHomeBindingImpl;
import com.example.blog_app.databinding.FragmentPostDetailBindingImpl;
import com.example.blog_app.databinding.FragmentPostPagerDetailBindingImpl;
import com.example.blog_app.databinding.HomePostRowBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ADDPOSTFRAGMENT = 1;

  private static final int LAYOUT_CARDROW = 2;

  private static final int LAYOUT_EDITPOSTFRAGMENT = 3;

  private static final int LAYOUT_FRAGMENTPOSTPAGERDETAIL = 4;

  private static final int LAYOUT_HOMEFRAGMENT = 5;

  private static final int LAYOUT_HOMEPOSTROW = 6;

  private static final int LAYOUT_POSTDETAILFRAGMENT = 7;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(7);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.blog_app.R.layout.add_post_fragment, LAYOUT_ADDPOSTFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.blog_app.R.layout.card_row, LAYOUT_CARDROW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.blog_app.R.layout.edit_post_fragment, LAYOUT_EDITPOSTFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.blog_app.R.layout.fragment_post_pager_detail, LAYOUT_FRAGMENTPOSTPAGERDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.blog_app.R.layout.home_fragment, LAYOUT_HOMEFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.blog_app.R.layout.home_post_row, LAYOUT_HOMEPOSTROW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.blog_app.R.layout.post_detail_fragment, LAYOUT_POSTDETAILFRAGMENT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ADDPOSTFRAGMENT: {
          if ("layout/add_post_fragment_0".equals(tag)) {
            return new AddPostFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for add_post_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_CARDROW: {
          if ("layout/card_row_0".equals(tag)) {
            return new CardRowBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for card_row is invalid. Received: " + tag);
        }
        case  LAYOUT_EDITPOSTFRAGMENT: {
          if ("layout/edit_post_fragment_0".equals(tag)) {
            return new EditPostFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for edit_post_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPOSTPAGERDETAIL: {
          if ("layout/fragment_post_pager_detail_0".equals(tag)) {
            return new FragmentPostPagerDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_post_pager_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_HOMEFRAGMENT: {
          if ("layout/home_fragment_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for home_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_HOMEPOSTROW: {
          if ("layout/home_post_row_0".equals(tag)) {
            return new HomePostRowBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for home_post_row is invalid. Received: " + tag);
        }
        case  LAYOUT_POSTDETAILFRAGMENT: {
          if ("layout/post_detail_fragment_0".equals(tag)) {
            return new FragmentPostDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for post_detail_fragment is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "post");
      sKeys.put(2, "posts");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(7);

    static {
      sKeys.put("layout/add_post_fragment_0", com.example.blog_app.R.layout.add_post_fragment);
      sKeys.put("layout/card_row_0", com.example.blog_app.R.layout.card_row);
      sKeys.put("layout/edit_post_fragment_0", com.example.blog_app.R.layout.edit_post_fragment);
      sKeys.put("layout/fragment_post_pager_detail_0", com.example.blog_app.R.layout.fragment_post_pager_detail);
      sKeys.put("layout/home_fragment_0", com.example.blog_app.R.layout.home_fragment);
      sKeys.put("layout/home_post_row_0", com.example.blog_app.R.layout.home_post_row);
      sKeys.put("layout/post_detail_fragment_0", com.example.blog_app.R.layout.post_detail_fragment);
    }
  }
}
