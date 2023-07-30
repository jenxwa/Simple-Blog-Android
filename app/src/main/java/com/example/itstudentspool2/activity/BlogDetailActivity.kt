package com.example.itstudentspool2.activity

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.itstudentspool2.R
import com.example.itstudentspool2.data.BlogData

class BlogDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_blog_details)

        val blogData = intent.getParcelableExtra<BlogData>("EXTRA_BLOG_DATA")

        // Get the views from the XML layout
        val titleTextView = findViewById<TextView>(R.id.detail_blog_title)
        val descriptionTextView = findViewById<TextView>(R.id.detail_blog_description)
        val imageView = findViewById<ImageView>(R.id.detail_blog_image)

        // Set the data from the blogData object to the views
        titleTextView.text = blogData?.title
        descriptionTextView.text = blogData?.description
        blogData?.imageResId?.let { imageView.setImageResource(it) }
    }
}
