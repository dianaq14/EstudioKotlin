package com.dianaq.myapp.imc_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.dianaq.myapp.R
import com.dianaq.myapp.imc_calculator.ImcCalculatorActivity.Companion.IMC_KEY

class ResultIMCActivity : AppCompatActivity() {

    private lateinit var tvResult: TextView
    private lateinit var tvIMC: TextView
    private lateinit var tvDescription: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_imcactivity)
        val result = intent.extras?.getDouble(IMC_KEY)?: -1.0
        initComponents()
        initUI(result)
    }

    private fun initUI(result: Double) {
        when(result) {
            in 0.00..18.50 -> { //Bajo peso
                tvResult.text
                tvIMC
                tvDescription
            }
            in 18.51..24.99 -> { //peso normal
                tvResult.text
                tvIMC
                tvDescription
            }
            in 25.00..29.99 -> { //sobrepeso
                tvResult.text
                tvIMC
                tvDescription
            }

            in 30.00..99.99 -> { //Obesidad
                tvResult.text
                tvIMC
                tvDescription
            }
            else -> { //error
                tvResult.text = "Error"
                tvIMC.text = "Error"
                tvDescription.text = "Error"
            }
        }
    }

    private fun initComponents() {
        tvResult = findViewById(R.id.tvResult)
        tvIMC = findViewById(R.id.tvIMC)
        tvDescription = findViewById(R.id.tvDescription)
    }
}