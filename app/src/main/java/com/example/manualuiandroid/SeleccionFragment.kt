package com.example.manualuiandroid

import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.Switch
import android.widget.Toast
import androidx.fragment.app.Fragment

class SeleccionFragment : Fragment(R.layout.fragment_seleccion) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val check = view.findViewById<CheckBox>(R.id.checkEjemplo)
        val sw = view.findViewById<Switch>(R.id.switchEjemplo)

        check.setOnCheckedChangeListener { _, isChecked ->
            val msg = if (isChecked) "Marcado" else "Desmarcado"
            Toast.makeText(context, "CheckBox: $msg", Toast.LENGTH_SHORT).show()
        }

        sw.setOnCheckedChangeListener { _, isChecked ->
            val msg = if (isChecked) "Encendido" else "Apagado"
            Toast.makeText(context, "Switch: $msg", Toast.LENGTH_SHORT).show()
        }
    }
}