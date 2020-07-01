package kr.co.tjoeun.kotlinbasic_200701

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
    }
}