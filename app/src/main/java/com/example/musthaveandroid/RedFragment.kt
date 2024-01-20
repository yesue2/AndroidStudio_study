package com.example.musthaveandroid

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class RedFragment : Fragment() {
    override fun onCreateView( // 프래그먼트 레이아웃을 연결할 때 사용하는 콜백 함수
        // 뷰 생성 객체
        inflater: LayoutInflater,
        // 생성할 뷰(자식 뷰)가 들어갈 부모 뷰
        container: ViewGroup?,
        // 이전 프래그먼트 객체에서 전달된 데이터(번들)
        savedInstanceState: Bundle?
    ): View? {
        // 인수로 받는 inflater를 통해 프래그먼트의 레이아웃 지정
        // inflate(리소스 참조값, 부모 뷰, attachToRoot)
        //attachToRoot: 지금 즉시 부모 뷰에 뷰를 추가할 것인지 나중에 추가할 것인지
        return inflater.inflate(R.layout.fragment_red, container, false);
    }
}