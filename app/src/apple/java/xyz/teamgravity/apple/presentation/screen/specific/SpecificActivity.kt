package xyz.teamgravity.apple.presentation.screen.specific

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import xyz.teamgravity.productflavordemo.core.util.ThemeUtil
import xyz.teamgravity.productflavordemo.databinding.ActivitySpecificBinding

class SpecificActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySpecificBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySpecificBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ThemeUtil.handlePaddings(binding.root)
    }
}