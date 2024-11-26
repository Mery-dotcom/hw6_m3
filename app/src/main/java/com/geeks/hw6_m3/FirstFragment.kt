package com.geeks.hw6_m3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.geeks.hw6_m3.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private var binding: FragmentFirstBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.button?.setOnClickListener {
            openContinentsFragment()
        }
    }

    private fun openContinentsFragment() {
        val counter = 0
        val bundle = Bundle().apply {
            putInt("counter", counter)
        }
        val continentsFragment = ContinentsFragment().apply {
            arguments = bundle
        }
        val action = FirstFragmentDirections.actionFirstFragment3ToContinentsFragment2()
        findNavController().navigate(action)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}