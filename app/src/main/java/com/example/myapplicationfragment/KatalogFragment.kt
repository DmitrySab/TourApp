package com.example.myapplicationfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class KatalogFragment : Fragment() {

   // private lateinit var aboutButton : Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val view =  inflater.inflate(R.layout.recycler_view, container, false)
        val bannerList :List<Banner> = listOf(
            Banner(R.drawable.s_dor,"автомобильная дорога",""),
            Banner(R.drawable.s_fru,"фруктовый сад",""),
            Banner(R.drawable.s_kust,"кусты",""),
            Banner(R.drawable.s_lin,"линия электропередач",""),
            Banner(R.drawable.s_mst,"мост",""),
            Banner(R.drawable.s_rek,"река",""),
            Banner(R.drawable.s_torf,"торфоразработки",""),
            Banner(R.drawable.s_vdk,"водокачка","")
        )
        val bannerRecyclerView : RecyclerView = view.findViewById(R.id.unit_recycler_view)
        bannerRecyclerView.layoutManager =
            LinearLayoutManager(view.context, LinearLayoutManager.VERTICAL,false)
        bannerRecyclerView.adapter = BannerAdapter(bannerList)


        return view
    }


}