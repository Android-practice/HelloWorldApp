package com.example.helloworldapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() { //MainActivity -> AppCompatActivity -> ComponentActivity -> Activity
    override fun onCreate(savedInstanceState: Bundle?) { //앱이 특정 상황(메모리 부족으로 강제종료 등)에서 종료될 경우 상황을 저장해서 실행시 돌려줌(default = null)
        super.onCreate(savedInstanceState) //
        setContentView(R.layout.activity_lyj)//보여줄 레이아웃을 지정해줌
        //R : 모든 리소스를 식별할 수 있는 변수가 정의됨 ex)리소스의 색, 리소스의 문자열 등등
        //R.color 로 해당 리소스의 색에 접근할 수 있다는 의미
    }
}