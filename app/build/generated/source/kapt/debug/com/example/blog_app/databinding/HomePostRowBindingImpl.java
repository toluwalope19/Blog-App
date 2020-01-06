package com.example.blog_app.databinding;
import com.example.blog_app.R;
import com.example.blog_app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class HomePostRowBindingImpl extends HomePostRowBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.edit, 7);
        sViewsWithIds.put(R.id.clapIcon, 8);
        sViewsWithIds.put(R.id.menu, 9);
    }
    // views
    @NonNull
    private final android.widget.TextView mboundView4;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public HomePostRowBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private HomePostRowBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[8]
            , (android.widget.TextView) bindings[6]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[2]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[3]
            );
        this.clapNo.setTag(null);
        this.linear1.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.postDate.setTag(null);
        this.showPostHomeCategory.setTag(null);
        this.showPostHomeImage.setTag(null);
        this.showPostHomeTitle.setTag(null);
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
        java.lang.String postsDate = null;
        java.lang.String postsPost = null;
        com.example.blog_app.model.Post posts = mPosts;
        java.lang.String postsTitle = null;
        java.lang.String postsImage = null;
        int postsClap = 0;
        java.lang.String postsCategory = null;
        java.lang.String stringValueOfPostsClap = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (posts != null) {
                    // read posts.date
                    postsDate = posts.getDate();
                    // read posts.post
                    postsPost = posts.getPost();
                    // read posts.title
                    postsTitle = posts.getTitle();
                    // read posts.image
                    postsImage = posts.getImage();
                    // read posts.clap
                    postsClap = posts.getClap();
                    // read posts.category
                    postsCategory = posts.getCategory();
                }


                // read String.valueOf(posts.clap)
                stringValueOfPostsClap = java.lang.String.valueOf(postsClap);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.clapNo, stringValueOfPostsClap);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, postsPost);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.postDate, postsDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.showPostHomeCategory, postsCategory);
            androidx.databinding.adapters.ImageViewBindingAdapter.setImageUri(this.showPostHomeImage, postsImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.showPostHomeTitle, postsTitle);
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