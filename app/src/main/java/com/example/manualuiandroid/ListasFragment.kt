package com.example.manualuiandroid

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.fragment.app.Fragment

class ListasFragment : Fragment(R.layout.fragment_listas) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listaUI = view.findViewById<ListView>(R.id.miLista)
        val materias = listOf("Sistemas Operativos", "Compiladores", "Redes", "Móviles", "Web")

        val adaptador = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, materias)
        listaUI.adapter = adaptador

        listaUI.setOnItemClickListener { _, _, position, _ ->
            Toast.makeText(context, "Elegiste: ${materias[position]}", Toast.LENGTH_SHORT).show()
        }
    }
}