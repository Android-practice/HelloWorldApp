package com.example.helloworldapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TwoColorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_color)

        settingButtons()

    }


    fun settingButtons(){
        val button_red = findViewById<Button>(R.id.button_red_fragment)
        val button_green = findViewById<Button>(R.id.button_green_fragment)

        //클릭시 작동 파트
        button_red.setOnClickListener {

            /*
            FragmentTransaction class
            - 프래그먼트를 생성, 제거, 변경

             */

            val fragmentTransaction = supportFragmentManager.beginTransaction() //FragmentTransaction 객체를 리턴
            fragmentTransaction.replace(R.id.frame_layout, RedFragment()) // (프래그먼트를 등록할 액티비티의 태그, 등록할 프래그먼트)
            fragmentTransaction.commit() //transcation은 항상 커밋이 필수
        }

        button_green.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction() //FragmentTransaction 객체를 리턴
            fragmentTransaction.replace(R.id.frame_layout, GreenFragment()) // (프래그먼트를 등록할 액티비티의 태그, 등록할 프래그먼트)
            fragmentTransaction.commit() //transcation은 항상 커밋이 필수
        }

    }

}