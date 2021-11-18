package com.example.myapplicationfragment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class AboutFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view:View = inflater.inflate(R.layout.fragment_about, container, false)
        val backButton:Button = view.findViewById(R.id.back_button)
        val buttonSend: ImageButton = view.findViewById(R.id.button_send)
        val odin: TextView = view.findViewById(R.id.odin)
        val homeFragment = HomeFragment()

        backButton.setOnClickListener {
            activity?.supportFragmentManager
                ?.beginTransaction()
                ?.replace(R.id.fragment_container, homeFragment)
                ?.commit()
        }

        val intentSend = Intent(Intent.ACTION_SEND)
        intentSend.type = "text/plain"
        intentSend.putExtra(Intent.EXTRA_TEXT, R.string.app_name.toString() )
        val chooser = Intent.createChooser(intentSend,"Поделиться названием приложения (пока так)")
        buttonSend.setOnClickListener{
            startActivity(chooser)
        }

        val address: Uri = Uri.parse("https://odin.study/ru/Discipline/Info/10714")
        val openLink = Intent(Intent.ACTION_VIEW, address)
        odin.setOnClickListener{
            startActivity(openLink)
        }
        return view
    }

}