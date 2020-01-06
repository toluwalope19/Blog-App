package com.example.blog_app

import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
data class User (

   val uid: String, val name : String, val profession : String, val email :String
    )