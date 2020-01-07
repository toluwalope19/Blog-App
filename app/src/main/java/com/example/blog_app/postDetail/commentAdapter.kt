package com.example.blog_app.postDetail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.blog_app.Home.HomeAdapter
import com.example.blog_app.databinding.CommentRowBinding
import com.example.blog_app.databinding.FragmentPostDetailBinding
import com.example.blog_app.databinding.HomePostRowBinding
import com.example.blog_app.model.Comment
import com.example.blog_app.model.OnItemClickListener
import com.example.blog_app.model.Post

class CommentAdapter: RecyclerView.Adapter<CommentAdapter.CommentHolder>() {

    var comments: List<Comment> = arrayListOf()
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CommentHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = CommentRowBinding.inflate(inflater,parent,false)

        return CommentHolder(binding)
    }

    override fun getItemCount(): Int {
      return comments.size
    }

    override fun onBindViewHolder(holder: CommentHolder, position: Int) {
        val comments = comments.get(position)
        holder.bind(comments)
    }

    class CommentHolder(var binding: CommentRowBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(comment: Comment) {

            binding.comments = comment

            binding.executePendingBindings()




        }

    }
}