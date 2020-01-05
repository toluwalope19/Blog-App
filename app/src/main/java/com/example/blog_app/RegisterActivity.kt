package com.example.blog_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthException
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase


class RegisterActivity : AppCompatActivity() {
    lateinit var emailId: EditText
    lateinit var password : EditText
    lateinit var  userName: EditText
    lateinit var profession : EditText
    lateinit var signUp : Button
    lateinit var alreadyRegistered : TextView
    lateinit var database : DatabaseReference


    private lateinit var mFirebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        mFirebaseAuth  =FirebaseAuth.getInstance()
        emailId = findViewById(R.id.addEmail)
        password =findViewById(R.id.addPassword)
        userName = findViewById(R.id.addName)
        profession = findViewById(R.id.addProfession)
        signUp =findViewById(R.id.regUser)
        alreadyRegistered = findViewById(R.id.readyRegistered)



        signUp.setOnClickListener{
            var email = emailId.text.toString()
            var pwd = password.text.toString()
            var name = userName.text.toString()
            var prof = profession.text.toString()

            if(email.isEmpty()){
                emailId.setError("provide email")
                emailId.requestFocus()
            }else if(pwd.isEmpty()){
                password.setError("please input password")
                password.requestFocus()
            }else if (email.isEmpty() && pwd.isEmpty()){
                Toast.makeText(this,"fields are empty",Toast.LENGTH_SHORT).show()
            }else if (!(email.isEmpty() && pwd.isEmpty())){
               this.mFirebaseAuth.createUserWithEmailAndPassword(email,pwd).addOnCompleteListener(this,
                   OnCompleteListener<AuthResult>{task ->
                       if (task.isSuccessful){
                           database = FirebaseDatabase.getInstance().reference
                           val userId = mFirebaseAuth.currentUser?.uid
                           database.child(userId!!).child("Name").setValue(name)
                           database.child(userId).child("Profession").setValue(prof)
                           startActivity(Intent(this,LogInActivity::class.java))
                           Toast.makeText(this, "Successfully registered :)", Toast.LENGTH_LONG).show()
                       }else{
                           val e =
                               task.exception as FirebaseAuthException?
                           Toast.makeText(this, "Error registering, try again later :(" + e?.message, Toast.LENGTH_LONG).show()
                       }
                   } )
            }
            else{
                Toast.makeText(this,"error occurred!",Toast.LENGTH_SHORT).show()
            }


        }
        alreadyRegistered.setOnClickListener {
            startActivity(Intent(this,LogInActivity::class.java))
        }

    }
}
