package com.example.myapplicationfragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton

class AboutFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view:View = inflater.inflate(R.layout.fragment_about, container, false)

        val backButton:Button = view.findViewById(R.id.back_button)
        val buttonSend: ImageButton = view.findViewById(R.id.button_send)
        val menuFragment = MenuFragment()

        backButton.setOnClickListener {
            activity?.supportFragmentManager
                ?.beginTransaction()
                ?.replace(R.id.fragment_container, menuFragment)
                ?.commit()
        }

        val intent3 = Intent(Intent.ACTION_SEND)
        intent3.type = "text/plain"
        intent3.putExtra(Intent.EXTRA_TEXT, R.string.app_name.toString() )
        val chooser = Intent.createChooser(intent3,"Поделиться названием приложения (пока так)")
        buttonSend.setOnClickListener{
            startActivity(chooser)
        }

        return view
    }

}