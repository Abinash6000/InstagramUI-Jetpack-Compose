package com.project.instagramui.main_feed_screen.model

import androidx.compose.ui.graphics.painter.Painter

data class User(
    val profilePic: Painter,
    val postPic: Painter,
    val username: String,
    val location: String,
    val caption: String,
    val likeCount: Int,
    val commentCount: Int
)
