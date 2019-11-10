package com.example.calcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(),View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        
        setContentView(R.layout.activity_main)

        addition.setOnClickListener(this)
        subtraction.setOnClickListener(this)
        multiplication.setOnClickListener(this)
        division.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        val intent = Intent(this, SubActivity::class.java)
        //Log.d("test",input1.text.toString())
        intent.putExtra("para1",input1.text.toString())
        intent.putExtra("para2",input2.text.toString())

        when(v.id){
            R.id.addition -> intent.putExtra("para3","addition")
            R.id.subtraction -> intent.putExtra("para3","subtraction")
            R.id.multiplication -> intent.putExtra("para3","multiplication")
            R.id.division -> intent.putExtra("para3","division")
        }
        if (input1.text.isEmpty() || input2.text.isEmpty()){
            errormessage.text="数値を入力してください。"
        }else{
            startActivity(intent)
        }
    }
}

