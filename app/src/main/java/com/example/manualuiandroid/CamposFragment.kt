package com.example.manualuiandroid

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment

class CamposFragment : Fragment(R.layout.fragment_campos) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val etNombre = view.findViewById<EditText>(R.id.etNombre)
        val btnSaludar = view.findViewById<Button>(R.id.btnSaludar)

        btnSaludar.setOnClickListener {
            val nombre = etNombre.text.toString()
            if (nombre.isNotEmpty()) {
                Toast.makeText(context, "¡Hola, $nombre!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(context, "Escribe algo primero", Toast.LENGTH_SHORT).show()
            }
        }
    }
}