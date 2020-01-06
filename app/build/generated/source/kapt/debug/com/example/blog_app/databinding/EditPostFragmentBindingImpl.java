package com.example.blog_app.databinding;
import com.example.blog_app.R;
import com.example.blog_app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class EditPostFragmentBindingImpl extends EditPostFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.error1, 5);
        sViewsWithIds.put(R.id.changeImage, 6);
        sViewsWithIds.put(R.id.editSubmitPost, 7);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener editCategoryandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of posts.category
            //         is posts.setCategory((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editCategory);
            // localize variables for thread safety
            // posts != null
            boolean postsJavaLangObjectNull = false;
            // posts
            com.example.blog_app.model.Post posts = mPosts;
            // posts.category
            java.lang.String postsCategory = null;



            postsJavaLangObjectNull = (posts) != (null);
            if (postsJavaLangObjectNull) {




                posts.setCategory(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener editPostandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of posts.post
            //         is posts.setPost((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editPost);
            // localize variables for thread safety
            // posts != null
            boolean postsJavaLangObjectNull = false;
            // posts.post
            java.lang.String postsPost = null;
            // posts
            com.example.blog_app.model.Post posts = mPosts;



            postsJavaLangObjectNull = (posts) != (null);
            if (postsJavaLangObjectNull) {




                posts.setPost(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener editPostTitleandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of posts.title
            //         is posts.setTitle((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editPostTitle);
            // localize variables for thread safety
            // posts.title
            java.lang.String postsTitle = null;
            // posts != null
            boolean postsJavaLangObjectNull = false;
            // posts
            com.example.blog_app.model.Post posts = mPosts;



            postsJavaLangObjectNull = (posts) != (null);
            if (postsJavaLangObjectNull) {




                posts.setTitle(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public EditPostFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private EditPostFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[6]
            , (android.widget.EditText) bindings[2]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.EditText) bindings[3]
            , (android.widget.EditText) bindings[1]
            , (android.widget.Button) bindings[7]
            , (android.widget.TextView) bindings[5]
            );
        this.editCategory.setTag(null);
        this.editImage.setTag(null);
        this.editPost.setTag(null);
        this.editPostTitle.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.posts == variableId) {
            setPosts((com.example.blog_app.model.Post) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPosts(@Nullable com.example.blog_app.model.Post Posts) {
        this.mPosts = Posts;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.posts);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String postsPost = null;
        com.example.blog_app.model.Post posts = mPosts;
        java.lang.String postsTitle = null;
        java.lang.String postsImage = null;
        java.lang.String postsCategory = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (posts != null) {
                    // read posts.post
                    postsPost = posts.getPost();
                    // read posts.title
                    postsTitle = posts.getTitle();
                    // read posts.image
                    postsImage = posts.getImage();
                    // read posts.category
                    postsCategory = posts.getCategory();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editCategory, postsCategory);
            androidx.databinding.adapters.ImageViewBindingAdapter.setImageUri(this.editImage, postsImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editPost, postsPost);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editPostTitle, postsTitle);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editCategory, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editCategoryandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editPost, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editPostandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editPostTitle, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editPostTitleandroidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): posts
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}