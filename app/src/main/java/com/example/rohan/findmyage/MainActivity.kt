package com.example.rohan.findmyage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bufindage.setOnClickListener {
            var yearofbirth:Int=yeofbirth.text.toString().toInt()
            var currentyear=Calendar.getInstance().get(Calendar.YEAR)
            var yearage=currentyear-yearofbirth
            var currentmonth=Calendar.getInstance().get(Calendar.MONTH)
            var monthofbirth:Int=monofbirth.text.toString().toInt()
            var dateofbirth:Int=datofbirth.text.toString().toInt()
            var currentdate=Calendar.getInstance().get(Calendar.DATE)
            if ((currentmonth+1)<=(monthofbirth))
            {
                if ((dateofbirth)<(currentdate))
                     yearage=yearage-1
            }

            show.text="Your age is $yearage"
        }
    }
}
