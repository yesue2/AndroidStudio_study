package com.example.musthaveandroid

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        settingButton()
    }
    fun settingButton () {
        //xml 파일에서 추가한 버튼 객체를 변수로 만듦
        //findViewById()함수는 뷰의 id값을 인수로 받음
        val sub_button = findViewById<Button>(R.id.sub_button)
        val two_button = findViewById<Button>(R.id.two_button)
        val ailen_button = findViewById<Button>(R.id.ailen_button)

        //버튼이 클릭되었을 때 행동을 SetOnClickListener()에 지정
        sub_button.setOnClickListener {
            //intent 변수 생성 후 인턴드 객체 생성
            //Intent(현재 객체, 이동할 목적지)
            val intent = Intent(this, SubActivity::class.java)
            // startActivity() 함수는 방금 만든 인텐트 객체를 인수로 받아 새로운 액티비티 시작
            startActivity(intent)
        }

        two_button.setOnClickListener {
            val intent = Intent(this, TwoColorActivity::class.java)
            startActivity(intent)
        }

        ailen_button.setOnClickListener {
            val intent = Intent(this, LearningViews::class.java)
            startActivity(intent)
        }
    }
}