package com.mo.bet.app.gb.mos.game.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.mo.bet.app.gb.mos.game.R
import com.mo.bet.app.gb.mos.game.databinding.FragmentEndBinding
import com.mo.bet.app.gb.mos.game.sdhjdljsiklfjsasdsfdasa


class EndFragment : Fragment() {
lateinit var binding: FragmentEndBinding
    private lateinit var scoreText: TextView
    private var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            score = it.getInt(ARG_SCORE)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentEndBinding.inflate(inflater, container, false)
        val view = inflater.inflate(R.layout.fragment_end, container, false)
        scoreText = view.findViewById(R.id.score_text)
        scoreText.text = "Final Score: $score"
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button = view.findViewById<Button>(R.id.button)

      button.setOnClickListener {
            var strat = StartFragment()
            var repeat = requireFragmentManager()
            repeat.beginTransaction().replace(sdhjdljsiklfjsasdsfdasa.gjfshdjfgasd.id, strat).commit()

        }


    }

    companion object {
        private const val ARG_SCORE = "score"

        fun newInstance(score: Int): EndFragment {
            val fragment = EndFragment()
            val args = Bundle()
            args.putInt(ARG_SCORE, score)
            fragment.arguments = args
            return fragment
        }
    }
}