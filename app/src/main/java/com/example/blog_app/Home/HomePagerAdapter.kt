package com.example.blog_app.Home

import android.content.Context
import android.graphics.Color
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.blog_app.databinding.CardRowBinding
import com.example.blog_app.model.OnItemClickListener
import com.example.blog_app.model.Post
import kotlin.random.Random

class HomePagerAdapter(val onItemClickListener: OnItemClickListener, val context: Context,
                       var posts: List<Post> = arrayListOf()): RecyclerView.Adapter<HomePagerAdapter.HomePagerHolder>() {





    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomePagerHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = CardRowBinding.inflate(inflater,parent,false)


        return HomePagerHolder(binding)
    }

    override fun getItemCount(): Int {
        val rand = Random
        return posts.size
    }

    override fun onBindViewHolder(holder: HomePagerHolder, position: Int) {

        val post = posts.get(position)
        val imgString = post.image
        holder.bind(post, onItemClickListener)
        Glide.with(context).load(Uri.parse(imgString)).into(holder.binding.cardRowImage)

    }

    class HomePagerHolder(var binding: CardRowBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(post: Post, onItemClickListener: OnItemClickListener) {

            binding.posts = post
            binding.root.setOnClickListener {
                onItemClickListener.onClickAction(post)
            }
            binding.executePendingBindings()


        }

    }


}