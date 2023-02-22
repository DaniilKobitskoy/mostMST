    package com.mo.bet.app.gb.mos.game.fragments

import android.os.Bundle
import android.os.CountDownTimer
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.mo.bet.app.gb.mos.game.R
import com.mo.bet.app.gb.mos.game.sdhjdljsiklfjsasdsfdasa

    class GameFragment : Fragment() {

        private lateinit var button: Button
        private lateinit var countText: TextView
        private var count = 0
        private val timer = object : CountDownTimer(10000, 1000) {
            override fun onTick(millisUntilFinished: Long) {}
            override fun onFinish() {
                val endFragment = EndFragment.newInstance(count)
                parentFragmentManager.beginTransaction()
                    .replace(sdhjdljsiklfjsasdsfdasa.gjfshdjfgasd.id, endFragment)
                    .commit()
            }
        }

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            val view = inflater.inflate(R.layout.fragment_game, container, false)

            return view
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)

            button = view.findViewById(R.id.tap_button)
            countText = view.findViewById(R.id.count_text)
            button.setOnClickListener {
                count++
                countText.text = "Count: $count"
            }
            timer.start()

        }

        override fun onDestroyView() {
            super.onDestroyView()
            timer.cancel()
        }
    }
