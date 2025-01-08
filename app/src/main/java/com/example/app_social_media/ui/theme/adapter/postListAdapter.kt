package com.example.app_social_media.ui.theme.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.app_social_media.R
import com.example.app_social_media.local.post

class postListAdapter(
    var postList: MutableList<post>
): RecyclerView.Adapter<postListAdapter.PostViewHolder>() {
    inner class PostViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val postImage: ImageView = itemView.findViewById(R.id.post_image_user)
        val postUserName: TextView = itemView.findViewById(R.id.post_user_name)
        val postCaption: TextView = itemView.findViewById(R.id.post_caption)
        val postCreatedDate: TextView = itemView.findViewById(R.id.post_user_post_createdDate)
        val rvPostImage: RecyclerView = itemView.findViewById(R.id.rvPostImage)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): postListAdapter.PostViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_post, parent, false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: postListAdapter.PostViewHolder, position: Int) {
        holder.itemView.apply {
            val currentPost = postList[position]
            Log.d("currentPost", currentPost.toString())

            Glide.with(context).load(currentPost.userImageUrl).into(holder.postImage)
            holder.postUserName.text = currentPost.userName
            holder.postCreatedDate.text = currentPost.postCreatedDate
            holder.postCaption.text = currentPost.postCaption

            val imageAdapter = ImageItemAdapter(currentPost.postImageUrls)
            holder.rvPostImage.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            holder.rvPostImage.adapter = imageAdapter
        }
    }

    override fun getItemCount(): Int {
        return postList.size
    }
}