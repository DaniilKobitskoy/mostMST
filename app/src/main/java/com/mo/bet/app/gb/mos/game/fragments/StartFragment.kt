package com.mo.bet.app.gb.mos.game.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.mo.bet.app.gb.mos.game.R
import com.mo.bet.app.gb.mos.game.sdhjdljsiklfjsasdsfdasa

class StartFragment : Fragment() {

    private lateinit var startButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_start, container, false)
        startButton = view.findViewById(R.id.start_button)
        startButton.setOnClickListener {
            val gameFragment = GameFragment()
            parentFragmentManager.beginTransaction()
                .replace(sdhjdljsiklfjsasdsfdasa.gjfshdjfgasd.id, gameFragment)
                .commit()
        }
        return view
    }
    companion object {

        fun newInstance() =
            StartFragment()
    }
}
