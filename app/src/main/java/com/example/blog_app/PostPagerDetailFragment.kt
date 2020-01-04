package com.example.blog_app


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.blog_app.databinding.FragmentPostPagerDetailBinding
import com.example.blog_app.model.Post
import com.example.blog_app.postDetail.PostDetailFragment
import com.example.blog_app.postDetail.PostDetailFragmentArgs
import com.example.blog_app.postDetail.PostDetailViewModel
import java.util.*

/**
 * A simple [Fragment] subclass.
 */
class PostPagerDetailFragment : Fragment() {
    companion object {
        fun newInstance() = PostPagerDetailFragment()
    }

    val args: PostPagerDetailFragmentArgs by navArgs()

    private lateinit var viewModel: PostDetailViewModel

    private var posts: List<Post> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var binding =  FragmentPostPagerDetailBinding .inflate(inflater,container,false)
        viewModel = ViewModelProviders.of(this).get(PostDetailViewModel::class.java)


        binding.posts = args.post



//        val title = activity?.intent?.getStringExtra("title")
//        binding.detailTitle.text = title
//        val category = activity?.intent?.getStringExtra("category")
//        binding.detailCategory.text = category
//        val post = activity?.intent?.getStringExtra("post")
//        binding.postDetail.text = post
//        val image = activity?.intent?.getStringExtra("image")
//        binding.detailImage.setImageURI(Uri.parse(image))







        return binding.root
    }


    override fun onResume() {
        super.onResume()
        Objects.requireNonNull((Objects.requireNonNull(activity) as AppCompatActivity).supportActionBar)!!.hide()
    }


}
