package com.proyectoprogramacion4.deslizarentrefragmentos.Fragmentos


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.proyectoprogramacion4.deslizarentrefragmentos.R


class FragmentoAzul : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragmento_azul, container, false)
    }


}
