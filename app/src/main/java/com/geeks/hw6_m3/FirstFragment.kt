package com.geeks.hw6_m3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
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
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container_view, continentsFragment)
            .commit()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}