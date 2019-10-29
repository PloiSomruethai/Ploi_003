package com.example.somruethai

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
        btn_rach.setOnClickListener(View.OnClickListener {

            setProvice(getDrawable(R.drawable.rach_img), getString(R.string.btn_rach),getString(R.string.htr_rach))

        })
        btn_ranong.setOnClickListener(View.OnClickListener {
            setProvice(getDrawable(R.drawable.ranong_img), getString(R.string.btn_ranong),getString(R.string.htr_ranong))

        })
        btn_rayong.setOnClickListener(View.OnClickListener {
            setProvice(getDrawable(R.drawable.rayong_img), getString(R.string.btn_rayong),getString(R.string.htr_rayong))

        })
        btn_yala.setOnClickListener(View.OnClickListener {
            setProvice(getDrawable(R.drawable.yala_img), getString(R.string.btn_yala),getString(R.string.htr_yala))

        })
    }
    fun setProvice (drawable: Drawable?, header:String, content:String ){

        img_province.setImageDrawable(drawable)
        tv_header.setText("ข้อมูลจังหวัด "+header)
        tv_history.setText(content)

        Toast.makeText(this,
            "นี่คือ ข้อมูลจังหวัด "+header,Toast.LENGTH_LONG).show()
    }

}
