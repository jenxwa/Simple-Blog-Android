package com.example.itstudentspool2

import com.example.itstudentspool2.activity.BlogDetailActivity
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.itstudentspool2.data.BlogData
import com.example.itstudentspool2.databinding.ViewBlogItem2Binding

class BlogAdapter(private val blogList: List<BlogData>) : RecyclerView.Adapter<BlogAdapter.BlogViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlogViewHolder {
        val binding = ViewBlogItem2Binding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BlogViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BlogViewHolder, position: Int) {
        val currentBlog = blogList[position]
        holder.setData(currentBlog)
    }

    override fun getItemCount() = blogList.size

    inner class BlogViewHolder(private val binding: ViewBlogItem2Binding) : RecyclerView.ViewHolder(binding.root) {
        init {
            binding.root.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    val clickedBlogData = blogList[position]
                    val intent = Intent(it.context, BlogDetailActivity::class.java).apply {
                        putExtra("EXTRA_BLOG_DATA", clickedBlogData)
                    }
                    it.context.startActivity(intent)
                }
            }
        }

        fun setData(blogData: BlogData) {
            binding.blogItemTitle.text = blogData.title
            binding.blogItemJobDescription.text = blogData.jobDescription
            binding.blogItemDescription.text = blogData.descriptionShort
            blogData.imageResId?.let { binding.blogItemImage.setImageResource(it) }
        }
    }

}
