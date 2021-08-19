package com.nepplus.grammar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        코틀린 문법 연습용 프로젝트 (UI 작업 x)

//        본인의 이름을 저장할 String 변수 myName 으로 만들자

        val myName: String

//        myName에 실제 이름 대입

        myName = "권유진"

//        myName = "토리누나"
//        val는 저장된 값 변경 불가

//        덮어쓰기 가능

//        로그로 저장된 내 이름 출력.

        Log.d("변수확인", myName)


//        본인의 출생 년도를 변수로 저장.(myBirthYear)

        var myBirthYear: Int
        myBirthYear = 1996
        Log.d("출생년도", myBirthYear.toString())

// 조건문 체험 부분

        val userAge = 10

        if (userAge >= 20) {
            Log.d("나이확인", "성인입니다.")
        } else if (userAge >= 17) {
            Log.d("나이확인", "고등학생입니다.")
        } else if (userAge >= 14) {
            Log.d("나이확인", "중학생입니다.")
        } else if (userAge >= 8) {
            Log.d("나이확인", "초등학생입니다.")
        }

        // 장기근속의 3대 요건?
//1. 높은급여
//2. 가까운 거리
//3. 워라밸


        val companyASalary = 5800
        val companyADistance = 12.5
        val companyABalance = true

//        사람 1. 연봉이 4천 이상이면 취업.

        if (companyASalary >= 4000) {
//           연봉 높아서 취업.
        }

//        사람 2. 거리가 10km 미만 AND 연봉 3000 이상

        if (companyADistance < 10 && companyASalary >= 3000) {
//            사람 2는 멀어서 취업 안함.
        }

        if (companyABalance || companyASalary >= 5000)
//            사람 3은 취업(둘 중 하나만 만족해도 됨)
    }

}


