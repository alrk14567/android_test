package com.example.mergemodule

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mergemodule.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Ch6 View 실행 버튼
        binding.btnCh6View.setOnClickListener {
            val intent = Intent(this, Ch6ViewActivity::class.java)
            startActivity(intent)
        }

        // Ch7 Layout 실행 버튼
        binding.btnCh7Layout.setOnClickListener {
            val intent = Intent(this, Ch7LayoutActivity::class.java)
            startActivity(intent)
        }
    }
}
