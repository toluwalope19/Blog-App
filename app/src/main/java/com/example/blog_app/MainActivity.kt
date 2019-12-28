package com.example.blog_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.example.blog_app.R.id.*
import com.example.blog_app.Home.HomeFragment
import com.example.blog_app.addPost.AddPostFragment
import com.example.blog_app.favorites.FavouritesFragment
import com.example.blog_app.profile.ProfileFragment
import com.example.blog_app.search.SearchFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {


    lateinit var bottomNavigationView : BottomNavigationView




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager = supportFragmentManager.beginTransaction()

//        fragmentManager.add(, HomeFragment.newInstance(), "home fragment").commit()
        fragmentManager.add(R.id.Fragment,HomeFragment.newInstance(),"home fragment").commit()

        bottomNavigationView = findViewById(R.id.bottom_navigation)

        bottomNavigationView.selectedItemId = R.id.navigation_home

        bottomNavigationView.setOnNavigationItemSelectedListener(this)


    }

    var home =  HomeFragment()
    var favourites = FavouritesFragment()
    var addPost = AddPostFragment()
    var search = SearchFragment()
    var profile = ProfileFragment()


    override fun onNavigationItemSelected(p0: MenuItem): Boolean {

        when (p0.getItemId()){
            navigation_home ->{
                getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.Fragment, home).commit()
                return true
            }
            navigation_favourites ->{
                getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.Fragment, favourites).commit()
                return true
            }
            navigation_post ->{
                getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.Fragment, addPost).commit()
                return true
            }
            navigation_profile ->{
                getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.Fragment, profile).commit()
                return true
            }
        }

        return true
    }
}
