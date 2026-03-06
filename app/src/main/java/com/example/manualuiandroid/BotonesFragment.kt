package com.example.manualuiandroid

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.fragment.app.Fragment

class BotonesFragment : Fragment(R.layout.fragment_botones) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btn = view.findViewById<Button>(R.id.btnPrueba)
        val imgBtn = view.findViewById<ImageButton>(R.id.imgBtnPrueba)

        btn.setOnClickListener {
            Toast.makeText(context, "Presionaste el botón", Toast.LENGTH_SHORT).show()
        }

        imgBtn.setOnClickListener {
            Toast.makeText(context, "Presionaste el botón de imagen", Toast.LENGTH_SHORT).show()
        }
    }
}