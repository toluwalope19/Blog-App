package com.example.blog_app.databinding;
import com.example.blog_app.R;
import com.example.blog_app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class CardRowBindingImpl extends CardRowBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public CardRowBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private CardRowBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[2]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[3]
            );
        this.cardRowCategory.setTag(null);
        this.cardRowImage.setTag(null);
        this.cardRowTitle.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
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
        java.lang.String postsTitle = null;
        java.lang.String postsImage = null;
        com.example.blog_app.model.Post posts = mPosts;
        java.lang.String postsCategory = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (posts != null) {
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

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.cardRowCategory, postsCategory);
            androidx.databinding.adapters.ImageViewBindingAdapter.setImageUri(this.cardRowImage, postsImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.cardRowTitle, postsTitle);
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