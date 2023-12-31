package com.example.helpme

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.helpme.adapter.ItemAdapter
import com.example.helpme.data.Datasource

/**
 * A simple [Fragment] subclass.
 * Use the [NearByMeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class NearByMeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_nearbyme, container, false)

        val myDataset = Datasource().loadData()

        val recyclerView:RecyclerView = view.findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter((activity as MainActivity), myDataset)

        return view
    }
}