package com.example.manualuiandroid

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import androidx.fragment.app.Fragment

class InfoFragment : Fragment(R.layout.fragment_info) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val barra = view.findViewById<ProgressBar>(R.id.miProgreso)
        val btn = view.findViewById<Button>(R.id.btnMas)

        btn.setOnClickListener {
            barra.progress += 10
            if (barra.progress >= 100) barra.progress = 0
        }
    }
}