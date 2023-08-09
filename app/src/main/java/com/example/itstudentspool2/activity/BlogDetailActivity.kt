package com.example.itstudentspool2.activity

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.itstudentspool2.R
import com.example.itstudentspool2.data.BlogData
import com.example.itstudentspool2.databinding.ViewBlogChipBinding
import com.google.android.material.button.MaterialButton

class BlogDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_blog_details)

        val blogData = intent.getParcelableExtra<BlogData>("EXTRA_BLOG_DATA")

        // Get the views from the XML layout
        val titleTextView = findViewById<TextView>(R.id.detail_blog_title)
        val descriptionTextView = findViewById<TextView>(R.id.detail_blog_description)
        val imageView = findViewById<ImageView>(R.id.detail_blog_image)
        val chipContainer = findViewById<LinearLayout>(R.id.detail_blog_chip_container)

        // Set the data from the blogData object to the views
        chipContainer.removeAllViews()
        blogData?.chipList?.forEach { item ->
            val chipView = ViewBlogChipBinding.inflate(layoutInflater, chipContainer, false)
            chipView.root.text = item
            chipContainer.addView(chipView.root)
        }

        //onClickListener for the Button
        val seeMoreDetailsButton: MaterialButton = findViewById(R.id.detail_blog_apply_button)
        seeMoreDetailsButton.setOnClickListener {
            val intent = Intent(this, ApplyToJobActivity::class.java)
            startActivity(intent)
        }

        titleTextView.text = blogData?.title
        descriptionTextView.text = blogData?.description
        blogData?.imageResId?.let { imageView.setImageResource(it) }
    }
}
