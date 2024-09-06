package xyz.teamgravity.productflavordemo.presentation.screen.main

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import xyz.teamgravity.productflavordemo.core.util.ModuleUtil
import xyz.teamgravity.productflavordemo.core.util.ThemeUtil
import xyz.teamgravity.productflavordemo.databinding.ActivityMainBinding
import xyz.teamgravity.productflavordemo.presentation.screen.general.GeneralActivity
import xyz.teamgravity.productflavordemo.presentation.screen.specific.SpecificActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ThemeUtil.handlePaddings(binding.root)

        updateUI()
        button()
    }

    private fun updateUI() {
        setupModule()
    }

    private fun button() {
        onGeneral()
        onSpecific()
    }

    private fun setupModule() {
        ModuleUtil.getModules(this).forEach(binding.moduleContainer::addView)
    }

    private fun startGeneralActivity() {
        val intent = Intent(this, GeneralActivity::class.java)
        startActivity(intent)
    }

    private fun startSpecificActivity() {
        val intent = Intent(this, SpecificActivity::class.java)
        startActivity(intent)
    }

    private fun onGeneral() {
        binding.navigateGeneralB.setOnClickListener {
            startGeneralActivity()
        }
    }

    private fun onSpecific() {
        binding.navigateSpecificB.setOnClickListener {
            startSpecificActivity()
        }
    }
}