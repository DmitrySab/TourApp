package com.example.myapplicationfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MenuFragment : Fragment() {

 //   private lateinit var aboutButton : Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val view =  inflater.inflate(R.layout.recycler_view, container, false)

        val bannerList :List<Banner> = listOf(
            Banner(R.drawable.k_vos,"восьмерка",""),
            Banner(R.drawable.k_avst, "австрийский проводник",""),
            Banner(R.drawable.k_brms,"брамшкотовый",""),
            Banner(R.drawable.k_grpv, "грейпвайн",""),
            Banner(R.drawable.k_prov,"проводник",""),
            Banner(R.drawable.k_shv, "схватывающий",""),
            Banner(R.drawable.k_stro,"стремя",""),
            Banner(R.drawable.k_tkc, "ткацкий",""),
        )
        val bannerRecyclerView : RecyclerView = view.findViewById(R.id.unit_recycler_view)
        bannerRecyclerView.layoutManager =
            LinearLayoutManager(view.context, LinearLayoutManager.VERTICAL,false)
        bannerRecyclerView.adapter = BannerAdapter(bannerList)






        return view
    }


}