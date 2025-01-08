package com.example.app_social_media.local

data class post(
    val postId: Int,
    val userImageUrl: String,
    val postCaption: String,
    val userName: String,
    val postCreatedDate: String,
    val postImageUrls: List<String>,
)
