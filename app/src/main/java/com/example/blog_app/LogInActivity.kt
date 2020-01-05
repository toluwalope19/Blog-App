package com.example.blog_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class LogInActivity : AppCompatActivity() {
    lateinit var emailId: EditText
    lateinit var password : EditText
    lateinit var logIn : Button
    lateinit var notRegistered : TextView
    lateinit var mFirebaseAuth : FirebaseAuth
    private lateinit var mAuthState: FirebaseAuth.AuthStateListener
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        mFirebaseAuth = FirebaseAuth.getInstance()
        emailId = findViewById(R.id.enterEmail)
        password =findViewById(R.id.enterPassword)
        logIn = findViewById(R.id.Login)
        notRegistered = findViewById(R.id.notRegistered)

        mAuthState = FirebaseAuth.AuthStateListener {
            var mFirebaseUser = mFirebaseAuth.currentUser
            if(mFirebaseUser != null){
                Toast.makeText(this, "You are logged In", Toast.LENGTH_LONG).show()
                startActivity(Intent(this,MainActivity::class.java))

            }else{
                startActivity(Intent(this,LogInActivity::class.java))
                Toast.makeText(this, "Login failed", Toast.LENGTH_LONG).show()
            }
        }
        logIn.setOnClickListener {
            val email = emailId.text.toString()
            val pwd = password.text.toString()

            if(email.isEmpty()){
                emailId.setError("provide email")
                emailId.requestFocus()
            }else if(pwd.isEmpty()){
                password.setError("please input password")
                password.requestFocus()
            }else if (email.isEmpty() && pwd.isEmpty()){
                Toast.makeText(this,"fields are empty",Toast.LENGTH_SHORT).show()
            }else if (!(email.isEmpty() && pwd.isEmpty())){
                this.mFirebaseAuth.signInWithEmailAndPassword(email,pwd).addOnCompleteListener {
                    if(it.isSuccessful){
                        startActivity(Intent(this,MainActivity::class.java))
                    }
                }
            }
            else{
                Toast.makeText(this,"error occurred!",Toast.LENGTH_SHORT).show()
            }
        }
        notRegistered.setOnClickListener {
            startActivity(Intent(this,RegisterActivity::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        mFirebaseAuth.addAuthStateListener(mAuthState)
    }
}
