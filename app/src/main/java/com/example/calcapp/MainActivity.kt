package com.example.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_calc_second.*

class MainActivity : AppCompatActivity(),View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener (){
            // EditTextの文字列をTextViewに設定
            textView.text = editText.text.toString()

            var value1 = editText.text.toString()
            var value2 = editText2.text.toString()


        }
    }


    override fun onClick(v: View?) {
        val intent = Intent(this, CalcSecond::class.java)
        intent.putExtra("VALUE1", 10)
        intent.putExtra("VALUE2", 20)
        startActivity(intent)



    }
}
