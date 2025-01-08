package com.example.app_social_media.local

class post_list {
    private val postList: MutableList<post> = mutableListOf()

    fun addPost(post: post) {
        this.postList.add(post)
    }

    fun getPosts(): List<post> {
        return postList
    }
}