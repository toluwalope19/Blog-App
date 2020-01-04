package com.example.blog_app.postDetail

import android.app.Activity
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.blog_app.R
import com.example.blog_app.databinding.FragmentPostDetailBinding
import com.example.blog_app.model.Post
import kotlinx.android.synthetic.main.add_post_fragment.*
import kotlinx.android.synthetic.main.post_detail_fragment.*
import java.util.*


class PostDetailFragment : Fragment() {

    companion object {
        fun newInstance() = PostDetailFragment()
    }

    val args: PostDetailFragmentArgs by navArgs()

    private lateinit var viewModel: PostDetailViewModel

    private var posts: List<Post> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var binding =  FragmentPostDetailBinding.inflate(inflater,container,false)

        viewModel = ViewModelProviders.of(this).get(PostDetailViewModel::class.java)


        binding.posts = args.post



        return binding.root
    }


    override fun onResume() {
        super.onResume()
        Objects.requireNonNull((Objects.requireNonNull(activity) as AppCompatActivity).supportActionBar)!!.hide()
    }

}
