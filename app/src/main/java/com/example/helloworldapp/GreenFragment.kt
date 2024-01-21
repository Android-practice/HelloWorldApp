package com.example.helloworldapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class GreenFragment : Fragment() {


    //프래그먼트 생명주기 중 - onCreateView : 프레그먼트에 그릴 뷰를 생성할 때 호출됨 -> 그리고 나서  view를 반환
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //사용할 레이아웃 , 컨테이너(프래그먼트가 들어갈 부모view), 프래그먼트를 자동으로 추가해줄 것인지 수동으로 추가할 것인지
        return inflater.inflate(R.layout.fragment_green, container, false)
    }



}