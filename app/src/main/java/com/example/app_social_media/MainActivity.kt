package com.example.app_social_media

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.app_social_media.ui.theme.adapter.ImageItemAdapter


class MainActivity : ComponentActivity() {
    val imagePairs = listOf(
            "https://www-animeherald-com.exactdn.com/wp-content/uploads/2024/05/Bocchi-the-Rock-003-20240323.jpg?strip=all&lossy=1&ssl=1",
            "https://i.pinimg.com/736x/e8/70/80/e870804e27b0a544329be37868b77054.jpg",
            "https://preview.redd.it/bocchi-the-rock-character-appreciation-analysis-vol-iv-v0-un3xsdy4t6ca1.png?width=1920&format=png&auto=webp&s=60edc3b45b88b4f171db10d3e2f0291fef8c52c0"
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.item_post)

        Log.d("MainActivity", "onCreate: $imagePairs")

        val adapter = ImageItemAdapter(imagePairs)
        val recyclerView = findViewById<RecyclerView>(R.id.rvPostImage)

        recyclerView.adapter = adapter

        recyclerView.layoutManager = androidx.recyclerview.widget.LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)



    }
}

