package com.example.musthaveandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TwoColorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_color)

        settingButtons()
    }
    fun settingButtons() {
        val redButton = findViewById<Button>(R.id.button_red_fragment)
        val blueButton = findViewById<Button>(R.id.button_blue_fragment)

        redButton.setOnClickListener {
            // supportFragmentManager.beginTransaction()을 호출해 프래그먼트 트랜잭션 클래스의 객체 생성
            // 프래그먼트 트랜잭션: 프래그먼트 추가, 삭제, 기존 프래그먼트와 교체 후 백스택에 추가 등을 수행
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            // 트랜잭션에서 수행할 활동 정의
            // replace()로 기존의 프래그먼트를 새로운 프래그먼트로 교체
            //replace(프래그먼트를 넣는 프레임 레아이웃 id, 새로운 프래그먼트 객체)
            fragmentTransaction.replace(R.id.framelayout,RedFragment())
            // 트랜잭션 이후 반드시 commit() 함수 호출
            fragmentTransaction.commit()
        }

        blueButton.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.framelayout, BlueFragment())
            fragmentTransaction.commit()
        }
    }
}