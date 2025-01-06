package com.example.app_social_media.ui.theme.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.app_social_media.R

class ImageItemAdapter(
    var ImageList: List<String>
): RecyclerView.Adapter<ImageItemAdapter.ViewHolder>() {
    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageItemAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_image, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ImageItemAdapter.ViewHolder, position: Int) {
        val imageUrl = ImageList[position]
        Log.d("imageURL", imageUrl)
        holder.itemView.apply {
            Glide.with(context)
                .load(imageUrl)
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.error)
                .into(holder.itemView.findViewById<ImageView>(R.id.ivPostImageItem))

        }
    }

    override fun getItemCount(): Int {
        return ImageList.size
    }
}