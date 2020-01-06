package com.example.blog_app.databinding;
import com.example.blog_app.R;
import com.example.blog_app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentPostDetailBindingImpl extends FragmentPostDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.guideline3, 5);
        sViewsWithIds.put(R.id.guideline2, 6);
        sViewsWithIds.put(R.id.guideline, 7);
        sViewsWithIds.put(R.id.back, 8);
        sViewsWithIds.put(R.id.imageView3, 9);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentPostDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private FragmentPostDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[8]
            , (android.widget.TextView) bindings[2]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (androidx.constraintlayout.widget.Guideline) bindings[7]
            , (androidx.constraintlayout.widget.Guideline) bindings[6]
            , (androidx.constraintlayout.widget.Guideline) bindings[5]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.TextView) bindings[4]
            );
        this.detailCategory.setTag(null);
        this.detailImage.setTag(null);
        this.detailTitle.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.postDetail.setTag(null);
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

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.detailCategory, postsCategory);
            androidx.databinding.adapters.ImageViewBindingAdapter.setImageUri(this.detailImage, postsImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.detailTitle, postsTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.postDetail, postsPost);
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