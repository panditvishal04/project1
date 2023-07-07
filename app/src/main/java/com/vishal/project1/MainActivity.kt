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
    private lateinit var gd : Guideline
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
        gd=findViewById(R.id.guideline_horizontal_13)
        gd=findViewById(R.id.guideline_horizontal_18)
        gd=findViewById(R.id.guideline_horizontal_20)
        gd=findViewById(R.id.guideline_horizontal_30)
        gd=findViewById(R.id.guideline_horizontal_375)
        gd=findViewById(R.id.guideline_horizontal_40)
        gd=findViewById(R.id.guideline_horizontal_50)
        gd=findViewById(R.id.guideline_horizontal_525)
        gd=findViewById(R.id.guideline_horizontal_48)
        gd=findViewById(R.id.guideline_horizontal_237)
        gd=findViewById(R.id.guideline_horizontal_34)
        gd=findViewById(R.id.guideline_horizontal_43)
        gd=findViewById(R.id.guideline_horizontal_45)
       gd=findViewById(R.id.guideline_vertical_10)
        gd=findViewById(R.id.guideline_vertical_05)
        gd=findViewById(R.id.guideline_vertical_20)
        gd=findViewById(R.id.guideline_vertical_30)
        gd=findViewById(R.id.guideline_vertical_35)
        gd=findViewById(R.id.guideline_vertical_40)
        gd=findViewById(R.id.guideline_vertical_45)
        gd=findViewById(R.id.guideline_vertical_55)
        gd=findViewById(R.id.guideline_vertical_60)
        gd=findViewById(R.id.guideline_vertical_50)
        gd=findViewById(R.id.guideline_vertical_70)
        gd=findViewById(R.id.guideline_vertical_80)
        gd=findViewById(R.id.guideline_vertical_90)

    }
}