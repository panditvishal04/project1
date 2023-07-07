package com.vishal.project1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Switch
import android.widget.TextView
import androidx.constraintlayout.widget.Guideline

class MainActivity : AppCompatActivity() {

    private lateinit var dca :TextView
    private lateinit var mars :TextView
    private lateinit var space :TextView
    private lateinit var flights :TextView
    private lateinit var rovers :TextView
    private lateinit var one :TextView
    private lateinit var travel :TextView
    private lateinit var arrow :ImageView
    private lateinit var swt_on :Switch
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dca=findViewById(R.id.tv_dca)
        mars=findViewById(R.id.tv_mars)
        space=findViewById(R.id.tv_space)
        flights=findViewById(R.id.tv_flight)
        rovers=findViewById(R.id.tv_robers)
        one=findViewById(R.id.tv_one)
        travel=findViewById(R.id.tv_travel)
        arrow=findViewById(R.id.imgv_a)
        swt_on=findViewById(R.id.swt_on)
    }
}
