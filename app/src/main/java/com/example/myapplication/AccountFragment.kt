package com.example.myapplication

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.navigation.NavController
import com.example.myapplication.MainActivity
import com.example.myapplication.R

class AccountFragment : Fragment() {

    private var activity : MainActivity?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activity = activity
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view : View = inflater.inflate(R.layout.fragment_account, container, false)

        val tvCommon = view.findViewById<TextView>(R.id.tvCommon)
        val commonLayout = view.findViewById<LinearLayout>(R.id.commonLayout)

        tvCommon.setText("First")
        commonLayout.setBackgroundColor(resources.getColor(android.R.color.holo_purple))

        return view
    }
}