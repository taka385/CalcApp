package com.example.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calc_second.*

class SubActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc_second)

        val para1 = intent.getStringExtra("para1")
        val para2 = intent.getStringExtra("para2")
        val para3 = intent.getStringExtra("para3")

        val val1= para1.toDouble()
        val val2= para2.toDouble()
        val val3= para3

        calucular(val1,val2,val3)
    }

    private fun calucular(val1:Double,val2:Double,val3:String){
        when(val3){
            "addition" -> ans.text=(val1 + val2).toString()
            "subtraction" -> ans.text=(val1 - val2).toString()
            "multiplication" -> ans.text=(val1 * val2).toString()
            "division" -> ans.text=(val1 / val2).toString()

        }
    }
}
