package me.mariasuarez.taller_lazycolumn_lazyrowcoil

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import me.mariasuarez.taller_lazycolumn_lazyrowcoil.ui.theme.screens.FeedScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FeedScreen()
        }
    }
}

