package com.example.helloworldapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// 2-1. 액티비티 간의 전환
class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)
    }
}