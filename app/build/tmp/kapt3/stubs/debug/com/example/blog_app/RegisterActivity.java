package com.example.blog_app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u001a\u0010\u001d\u001a\u00020\u001eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0012\"\u0004\b%\u0010\u0014\u00a8\u0006*"}, d2 = {"Lcom/example/blog_app/RegisterActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "alreadyRegistered", "Landroid/widget/TextView;", "getAlreadyRegistered", "()Landroid/widget/TextView;", "setAlreadyRegistered", "(Landroid/widget/TextView;)V", "database", "Lcom/google/firebase/database/DatabaseReference;", "getDatabase", "()Lcom/google/firebase/database/DatabaseReference;", "setDatabase", "(Lcom/google/firebase/database/DatabaseReference;)V", "emailId", "Landroid/widget/EditText;", "getEmailId", "()Landroid/widget/EditText;", "setEmailId", "(Landroid/widget/EditText;)V", "mFirebaseAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "password", "getPassword", "setPassword", "profession", "getProfession", "setProfession", "signUp", "Landroid/widget/Button;", "getSignUp", "()Landroid/widget/Button;", "setSignUp", "(Landroid/widget/Button;)V", "userName", "getUserName", "setUserName", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class RegisterActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText emailId;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText password;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText userName;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText profession;
    @org.jetbrains.annotations.NotNull()
    public android.widget.Button signUp;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView alreadyRegistered;
    @org.jetbrains.annotations.NotNull()
    public com.google.firebase.database.DatabaseReference database;
    private com.google.firebase.auth.FirebaseAuth mFirebaseAuth;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getEmailId() {
        return null;
    }
    
    public final void setEmailId(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getPassword() {
        return null;
    }
    
    public final void setPassword(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getUserName() {
        return null;
    }
    
    public final void setUserName(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getProfession() {
        return null;
    }
    
    public final void setProfession(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getSignUp() {
        return null;
    }
    
    public final void setSignUp(@org.jetbrains.annotations.NotNull()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getAlreadyRegistered() {
        return null;
    }
    
    public final void setAlreadyRegistered(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.database.DatabaseReference getDatabase() {
        return null;
    }
    
    public final void setDatabase(@org.jetbrains.annotations.NotNull()
    com.google.firebase.database.DatabaseReference p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public RegisterActivity() {
        super();
    }
}