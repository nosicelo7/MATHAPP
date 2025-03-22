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

        //Get references to UI elements
        val num1 = findViewById<EditText>(R.id.InputNumOne)
        val num2 = findViewById<EditText>(R.id.InputNumTwo)
        val button = findViewById<Button>(R.id.btnCalculate)
        val textView = findViewById<TextView>(R.id.Result)

        val firstNumber: String = "Num1"
        val secondNumber: String = "Num2"
        val mySum: String = "Result"

        button.setOnClickListener {
            textView.text = """
             String: $firstNumber
             String: $secondNumber
             String: $mySum
         """.trimIndent()
        }
        if (firstNumber != null && secondNumber != null) {
            val sum = firstNumber + secondNumber
        } else {
            val mySum = "String: $mySum"
        }
    }   }
             
        