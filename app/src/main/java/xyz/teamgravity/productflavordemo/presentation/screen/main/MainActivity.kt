package xyz.teamgravity.productflavordemo.presentation.screen.main

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import xyz.teamgravity.productflavordemo.R
import xyz.teamgravity.productflavordemo.core.util.ThemeUtil

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ThemeUtil.handlePaddings(findViewById(R.id.main))
    }
}