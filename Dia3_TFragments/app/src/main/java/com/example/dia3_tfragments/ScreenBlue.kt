package com.example.dia3_tfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_screen_blue.*

class ScreenBlue : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_screen_blue, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_goToRed.setOnClickListener {
            activity!!.supportFragmentManager.beginTransaction().replace(R.id.frame_main, ScreenRed()).addToBackStack("RedFragment").commit()
        }
    }

}
