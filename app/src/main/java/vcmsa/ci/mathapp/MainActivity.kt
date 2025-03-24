package vcmsa.ci.mathapp

import android.icu.lang.UCharacter.NumericType
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity() : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //allows  text to be found and used in files
        findViewById<TextView>(R.id.txtWelcome)


        val num1: EditText = findViewById(R.id.InputNumOne)
        val num2: EditText = findViewById(R.id.InputNumTwo)
        val button: Button = findViewById(R.id.btnCalculate)
        val result: EditText = findViewById(R.id.Result)

        button.setOnClickListener {
            val num1_text = num1.text.toString()
            val num2_text = num2.text.toString()
            val sum = num1_text.toInt() + num2_text.toInt()
            result.setText(sum.toString())
        }


    }   }
             
        