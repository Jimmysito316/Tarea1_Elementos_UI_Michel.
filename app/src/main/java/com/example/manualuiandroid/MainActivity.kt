package com.example.manualuiandroid

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Carga inicial
        if (savedInstanceState == null) {
            cambiarFragment(CamposFragment())
        }

        // Configuración de botones del menú
        findViewById<Button>(R.id.btnF1).setOnClickListener { cambiarFragment(CamposFragment()) }
        findViewById<Button>(R.id.btnF2).setOnClickListener { cambiarFragment(BotonesFragment()) }
        findViewById<Button>(R.id.btnF3).setOnClickListener { cambiarFragment(SeleccionFragment()) }
        findViewById<Button>(R.id.btnF4).setOnClickListener { cambiarFragment(ListasFragment()) }
        findViewById<Button>(R.id.btnF5).setOnClickListener { cambiarFragment(InfoFragment()) }
    }

    private fun cambiarFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}