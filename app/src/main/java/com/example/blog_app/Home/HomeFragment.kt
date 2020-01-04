package com.example.blog_app.Home

import android.content.Intent
import android.gesture.GestureOverlayView
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.core.view.ViewCompat
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.widget.ViewPager2
import com.example.blog_app.R
import com.example.blog_app.databinding.FragmentHomeBinding
import com.example.blog_app.model.OnItemClickListener
import com.example.blog_app.model.Post
import com.example.blog_app.postDetail.PostDetailFragment
import kotlinx.android.synthetic.main.home_post_row.*



class HomeFragment : Fragment() {

    companion object {
        fun newInstance() = HomeFragment()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentHomeBinding.inflate(inflater,container,false)

       val viewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)


        var myView = binding.recyclerViewHome
        myView.layoutManager = LinearLayoutManager(context)

        with(binding.viewPager) {
            clipToPadding = false
            clipChildren = false
            offscreenPageLimit = 3
        }
        val pageMarginPx = resources.getDimensionPixelOffset(R.dimen.pageMargin)
        val offsetPx = resources.getDimensionPixelOffset(R.dimen.offset)
        binding.viewPager.setPageTransformer { page, position ->
            val viewPager = page.parent.parent as ViewPager2
            val offset = position * -(2 * offsetPx + pageMarginPx)
            if (viewPager.orientation == GestureOverlayView.ORIENTATION_HORIZONTAL) {
                if (ViewCompat.getLayoutDirection(viewPager) == ViewCompat.LAYOUT_DIRECTION_RTL) {
                    page.translationX = -offset

                } else {
                    page.translationX = offset
                }
            } else {
                page.translationY = offset
            }
        }
        var posts: List<Post> = arrayListOf()

          var adapter1 = HomePagerAdapter(object : OnItemClickListener {
            override fun onClickAction(post: Post) {
//                var intent = Intent(context,PostDetailFragment::class.java)
//                intent.putExtra("title", post.title)
//                intent.putExtra("category", post.category)
//                intent.putExtra("body", post.post)
//                intent.putExtra("image", post.image)
                val action = HomeFragmentDirections.actionHomeFragmentToPostPagerDetailFragment(post)

                findNavController().navigate(action)

//                startActivity(intent)
            }
        },context!!,posts)
          var adapter2 = HomeAdapter(object : OnItemClickListener {
            override fun onClickAction(post: Post) {
//                var intent = Intent(context,PostDetailFragment::class.java)
//                intent.putExtra("title", post.title)
//                intent.putExtra("category", post.category)
//                intent.putExtra("body", post.post)
//                intent.putExtra("image", post.image)

                val action = HomeFragmentDirections.actionHomeFragmentToPostDetailFragment(post)

                findNavController().navigate(action)
            }
        },context!!,viewModel.apply {

          })




        binding.viewPager.adapter = adapter1
        binding.recyclerViewHome.adapter = adapter2

        viewModel.getPosts(context!!).observe(this, Observer<List<Post>>{ posts ->
            posts?.let {
                adapter1.posts = posts
                adapter2.posts = posts
                adapter1.notifyDataSetChanged()
                adapter2.notifyDataSetChanged()
            }
        })
        binding.fab.setOnClickListener {


            findNavController().navigate(R.id.action_homeFragment_to_addPostFragment)

        }

        return binding.root
    }



}
