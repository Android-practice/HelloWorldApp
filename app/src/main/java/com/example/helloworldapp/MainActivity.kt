package com.example.helloworldapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() { //MainActivity -> AppCompatActivity -> ComponentActivity -> Activity
    override fun onCreate(savedInstanceState: Bundle?) { //앱이 특정 상황(메모리 부족으로 강제종료 등)에서 종료될 경우 상황을 저장해서 실행시 돌려줌(default = null)
        super.onCreate(savedInstanceState) //
        setContentView(R.layout.activity_main)//보여줄 레이아웃을 지정해줌
        //R : 모든 리소스를 식별할 수 있는 변수가 정의됨 ex)리소스의 색, 리소스의 문자열 등등
        //R.color 로 해당 리소스의 색에 접근할 수 있다는 의미


        //2-1) 액티비티 끼리의 화면 전환
        settingButton()


    }

    
    //2-1) 액티비티 끼리의 화면 전환 : 버튼을 이용해서 main -> subActivity로 이동하기
    fun settingButton(){
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            //sub activity로 이동
            // intent : 지향, 의도를 밝힐수 있게 해줌 -> 액티비티, 서비스, 브로드캐스트 리시버, 콘텐트 프로바이더 를 불러오거나 하는 것을 도와주는 객체
            val intent = Intent(this, SubActivity::class.java)// this(이 화면-main) --> SubAcitivity로 이동
            startActivity(intent)
        }
    }

}