package com.example.locobutton

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.Toast

class LocoButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0,
    defStyleRes: Int = 0
) : LinearLayout(context, attrs, defStyle, defStyleRes){

    init {
        LayoutInflater.from(context).inflate(R.layout.loco_butn, this, true)
        val btn = findViewById<ImageButton>(R.id.locoBtn)
        btn.setOnClickListener {
            Toast.makeText(context, "under pressure", Toast.LENGTH_SHORT).show()
        }
    }
}