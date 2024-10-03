package com.project.instagramui.main_feed_screen

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.project.instagramui.R
import com.project.instagramui.main_feed_screen.model.User

@Composable
fun MainFeedScreen() {

    val users = listOf(
        User(
            profilePic = painterResource(id = R.drawable.jon_snow),
            username = "jon_snow",
            postPic = painterResource(id = R.drawable.jon_snow_post),
            location = "Accra, Ghana",
            likeCount = 168,
            caption = "Hey Guy's, checkout my new post",
            commentCount = 15
        ),
        User(
            profilePic = painterResource(id = R.drawable.arya_stark),
            username = "arya_stark",
            postPic = painterResource(id = R.drawable.arya_stark_post),
            location = "Accra, Ghana",
            likeCount = 168,
            caption = "Hey Guy's, checkout my new post",
            commentCount = 15
        ),
        User(
            profilePic = painterResource(id = R.drawable.bran_stark),
            username = "bran_stark",
            postPic = painterResource(id = R.drawable.bran_stark_post),
            location = "Accra, Ghana",
            likeCount = 168,
            caption = "Hey Guy's, checkout my new post",
            commentCount = 15
        ),
        User(
            profilePic = painterResource(id = R.drawable.daenerys_targaryen),
            username = "daenerys_targaryen",
            postPic = painterResource(id = R.drawable.daenerys_targaryen_post),
            location = "Accra, Ghana",
            likeCount = 168,
            caption = "Hey Guy's, checkout my new post",
            commentCount = 15
        ),
        User(
            profilePic = painterResource(id = R.drawable.jorah_mormont),
            username = "jorah_mormont",
            postPic = painterResource(id = R.drawable.jorah_mormont_post),
            location = "Accra, Ghana",
            likeCount = 168,
            caption = "Hey Guy's, checkout my new post",
            commentCount = 15
        ),
        User(
            profilePic = painterResource(id = R.drawable.rob_stark),
            username = "rob_stark",
            postPic = painterResource(id = R.drawable.robb_stark_post),
            location = "Accra, Ghana",
            likeCount = 168,
            caption = "Hey Guy's, checkout my new post",
            commentCount = 15
        ),
        User(
            profilePic = painterResource(id = R.drawable.sansa_stark),
            username = "sansa_stark",
            postPic = painterResource(id = R.drawable.sansa_stark_post),
            location = "Accra, Ghana",
            likeCount = 168,
            caption = "Hey Guy's, checkout my new post",
            commentCount = 15
        ),
        User(
            profilePic = painterResource(id = R.drawable.tyrian_lannister),
            username = "tyrian_lannister",
            postPic = painterResource(id = R.drawable.tyrian_lannister_post),
            location = "Accra, Ghana",
            likeCount = 168,
            caption = "Hey Guy's, checkout my new post",
            commentCount = 15
        )
    )

    Scaffold(topBar = {
            TopBar()
        }, bottomBar = {
            BottomBar()
        }, containerColor = Color.White) { innerPadding ->
        LazyColumn(
            modifier = Modifier.padding(innerPadding)
        ) {
            item {
                LazyRow {
                    items(users) {item ->
                        StoryWidget(user = item)
                    }
                }
            }
            item { Divider() }
            items(users) {user ->
                PostWidget(user = user)
                Spacer(modifier = Modifier.height(15.dp))
            }
        }
    }
}

@Preview
@Composable
fun MainFeedPreview() {
    MainFeedScreen()
}