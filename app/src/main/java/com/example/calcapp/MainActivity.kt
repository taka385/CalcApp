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
        button1.setOnClickListener(this)
        button5.setOnClickListener(this)

    }


    override fun onClick(v: View?) {


        val intent = Intent(this, CalcSecond::class.java)
        intent.putExtra("VALUE1", 10)
        intent.putExtra("VALUE2", 20)
        startActivity(intent)

        val intent2 = Intent(this, CalcSecond::class.java)
        intent.putExtra("VALUE3", 10)
        intent.putExtra("VALUE4", 50)

        startActivity(intent2)


    }
}
