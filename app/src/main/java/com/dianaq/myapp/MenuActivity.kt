package com.dianaq.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.dianaq.myapp.firstapp.FirstAppActivity
import com.dianaq.myapp.firstapp.ResultActivity
import com.dianaq.myapp.imc_calculator.ImcCalculatorActivity
import com.dianaq.myapp.todoApp.TodoActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSaludApp = findViewById<Button>(R.id.btnSaludApp)
        val btnImcApp = findViewById<Button>(R.id.btnImcApp)
        val btnTODO = findViewById<Button>(R.id.btnTODO)
        btnSaludApp.setOnClickListener {  }
        btnImcApp.setOnClickListener { navigateToImcApp() }
        btnTODO.setOnClickListener { navigateToTodoApp() }
    }

    private fun navigateToTodoApp() {
        val intent= Intent(this, TodoActivity::class.java)
        startActivity(intent)

    }

    private fun navigateToImcApp() {
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)

    }

    private fun navigateToSaludApp(){
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }
}