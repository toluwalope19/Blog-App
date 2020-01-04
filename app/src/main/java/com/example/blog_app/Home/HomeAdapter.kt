package com.example.blog_app.Home

import android.app.AlertDialog
import android.content.Context
import android.net.Uri
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.blog_app.R
import com.example.blog_app.addPost.AddPostFragment
import com.example.blog_app.databinding.HomePostRowBinding
import com.example.blog_app.model.OnItemClickListener
import com.example.blog_app.model.Post

import com.squareup.picasso.Picasso

class HomeAdapter(val onItemClickListener: OnItemClickListener, val context: Context,var model : HomeViewModel): RecyclerView.Adapter<HomeAdapter.HomeHolder>() {




    var posts: List<Post> = arrayListOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = HomePostRowBinding.inflate(inflater,parent,false)

        return HomeHolder(binding)
    }

    override fun getItemCount(): Int {
        return posts.size
    }

    override fun onBindViewHolder(holder: HomeHolder, position: Int) {

        val post = posts.get(position)
        val imgString = post.image
        holder.bind(post, onItemClickListener)
        holder.binding.comment.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToEditPostFragment()
            action.post = posts[position]
            Navigation.findNavController(it).navigate(action)
        }
        Glide.with(context).load(Uri.parse(imgString)).into(holder.binding.showPostHomeImage)


        val clickListener = View.OnClickListener { view ->
            when (view.id) {
                R.id.menu -> {
                        var popup: PopupMenu? = null;
                        popup = PopupMenu(context, view)
                        popup.inflate(R.menu.delete)

                        popup.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item: MenuItem? ->

                            when (item!!.itemId) {
                                R.id.delete -> {
                                    val alertDialog = AlertDialog.Builder(context).create()
                                    alertDialog.setTitle("Delete")
                                    alertDialog.setMessage("Do you want to delete this Post")

                                    alertDialog.setButton(
                                        AlertDialog.BUTTON_POSITIVE, "Yes"
                                    ) { dialog, which -> model.deletePost(post) }

                                    alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "No"
                                    ) { dialog, which -> dialog.dismiss() }
                                    alertDialog.show()

                                    val btnPositive = alertDialog.getButton(AlertDialog.BUTTON_POSITIVE)
                                    val btnNegative = alertDialog.getButton(AlertDialog.BUTTON_NEGATIVE)

                                    val layoutParams = btnPositive.layoutParams as LinearLayout.LayoutParams
                                    layoutParams.weight = 10f
                                    btnPositive.layoutParams = layoutParams
                                    btnNegative.layoutParams = layoutParams
                                }
                                R.id.update ->{
                                    }
                                }

                            true
                        })

                        popup.show()

                }
            }
        }

        val button = holder.binding.menu
        button.setOnClickListener(clickListener)




    }

    class HomeHolder(var binding: HomePostRowBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(post: Post, onItemClickListener: OnItemClickListener) {

            binding.posts = post
            binding.root.setOnClickListener {
                onItemClickListener.onClickAction(post)
            }
            binding.executePendingBindings()




        }

    }



}