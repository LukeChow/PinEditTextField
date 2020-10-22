package com.poovam.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import com.poovam.pinedittextfield.LinePinField
import com.poovam.pinedittextfield.PinField

class SampleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample)
        val circleField = findViewById<PinField>(R.id.circleField)
        val squareField = findViewById<PinField>(R.id.squareField)
        val lineField = findViewById<PinField>(R.id.lineField) as LinePinField
        lineField.cursorWidth = 5
        lineField.cursorColor = resources.getColor(R.color.colorPrimaryDark)
        val listener = object : PinField.OnTextCompleteListener{
            override fun onTextComplete(enteredText: String): Boolean {
                Toast.makeText(this@SampleActivity,enteredText, Toast.LENGTH_SHORT).show()
                return@onTextComplete true
            }

        }
        circleField.onTextCompleteListener = listener
        squareField.onTextCompleteListener = listener
        lineField.onTextCompleteListener = listener
    }
}

