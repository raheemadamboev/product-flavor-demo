package xyz.teamgravity.productflavordemo.presentation.screen.general

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import xyz.teamgravity.productflavordemo.core.util.ThemeUtil
import xyz.teamgravity.productflavordemo.databinding.ActivityGeneralBinding

class GeneralActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGeneralBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityGeneralBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ThemeUtil.handlePaddings(binding.root)
    }
}