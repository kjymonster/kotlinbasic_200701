package kr.co.tjoeun.kotlinbasic_200701

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {  //fun == method
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)   //R == res폴더

        touchBtn.setOnClickListener {

            //touchBtn이 눌리면 실행될 코드를 적는 { }

            //Toast를 이용해 사용자에게 안내 메세지.
            Toast.makeText(this, "터치버튼을 눌렀습니다.", Toast.LENGTH_SHORT).show()

            // (어디서 띄울지, 메시지, 길게 보여줄지/짧게 보여줄지) .show()->화면에 띄우기

            Log.d("메인화면", "터치버튼 눌림")

            Log.e("메인화면", "에러 로그 찍어보기")


        }

        touchBtn2.setOnClickListener {

            Toast.makeText(this, "둘째 버튼 눌림", Toast.LENGTH_SHORT).show()
            Log.d("두번째버튼", "두번째 버튼 눌림")
        }

        //토스트 띄우기 버튼이 눌리면
        showToastBtn.setOnClickListener {

            //EditText에 입력된 내용을 받자. (=String으로 저장해 두자)
            //코틀린에서는 val로 만든 변수의 대입값이 String이면 => 변수 타입도(대입값도) 자동으로 String으로 결정됨.
         val inputContent = inputContentEdt.text.toString()

            //inputContent를 토스트로 출력
            Toast.makeText(this, inputContent, Toast.LENGTH_LONG).show()


            //10은 정수. 정수를 num1에 대입하면 num1은 자동으로 Int로 결정.
            //코틀린에서는 int를 Int로 표시 ( 자바-int / 코틀린-Int)

            // (예시) val num1 = 10

//            val a = 10  //val: 대입값을 상수로 지정. 값변경 불가 (value)
//            a = 9

//            var b = 10  //var: 변수로 지정, 값변경 가능 (variable)
//            b = 9

        }

        ageBtn.setOnClickListener {

            //입력한 나이를 Int로 저장하자.
            val inputAge = ageEdt.text.toString().toInt() //일단 String으로 받고 .toInt()

            //나이가 60이상이면 "어르신 입니다." 토스트 노출
            if(inputAge >= 60) {
                Toast.makeText(this, "어르신 입니다.", Toast.LENGTH_SHORT).show()
            }

            //입력된 나이값에 따라 다른 처리 when  (JAVA에서 switch)
            when (inputAge) {
                35 -> { Toast.makeText(this, "나랑 동갑이다.", Toast.LENGTH_SHORT).show()  }
                20 -> { Toast.makeText(this, "스무살이다.", Toast.LENGTH_SHORT).show()}
                in 10..19 -> {Toast.makeText(this, "10대 입니다.", Toast.LENGTH_SHORT).show()}
                29, 37 -> { Toast.makeText(this, "29살 이거나 37살 입니다.", Toast.LENGTH_SHORT).show() }
                else -> { Toast.makeText(this, "아무 해당 없는 나이", Toast.LENGTH_SHORT).show()}

            }
        }
    }
}