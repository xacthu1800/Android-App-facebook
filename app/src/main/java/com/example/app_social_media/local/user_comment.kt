package com.example.app_social_media.local

data class user_comment (
    val commentId: Int,
    val userImageUurl: String,
    val userName: String,
    val userComment: String,
    val userTimeComment: String,
    val userLikeCommentCount: Int,
)