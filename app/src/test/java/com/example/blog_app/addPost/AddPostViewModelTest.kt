package com.example.blog_app.addPost

import android.app.Application
import android.net.Uri
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.blog_app.Home.HomeViewModel
import com.example.blog_app.model.Post
import com.example.blog_app.model.PostRepository
import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*
import org.junit.Rule
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.robolectric.annotation.Config

@Config(manifest= Config.NONE)
@RunWith(AndroidJUnit4::class)
class AddPostViewModelTest {

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()
    lateinit var addPostViewModel: AddPostViewModel
    lateinit var postRepository: PostRepository
    lateinit var application: Application
    val post = Post(0,"barca","sport","I am that I am","21:00",0, Uri.parse("").toString())

    @Before
    fun setUp() {
        application = ApplicationProvider.getApplicationContext()
        postRepository = PostRepository.getRepository(application )
        addPostViewModel = AddPostViewModel(application)
    }

    @Test
    fun savePost() {
       val value = addPostViewModel.savePost(post)
       assertNotEquals(null, value)
    }
}