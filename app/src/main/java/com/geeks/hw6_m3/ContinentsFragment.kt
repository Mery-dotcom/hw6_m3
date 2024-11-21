package com.geeks.hw6_m3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.geeks.hw6_m3.databinding.FragmentContinentsBinding
import com.geeks.hw6_m3.databinding.FragmentCountryBinding

class ContinentsFragment : Fragment() {

    private lateinit var binding: FragmentContinentsBinding

    private val continents = ArrayList<Continent>()
    private val adapter = ContinentAdapter(this::onClick)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentContinentsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        initAdapter()
    }

    private fun loadData() {
        continents.apply {
            add(
                Continent(
                    "Asia",
                    "https://img.freepik.com/free-vector/flat-asia-map-infographic_23-2148753291.jpg?t=st=1732107174~exp=1732110774~hmac=6ff71c99e58391e034bb0c99a4d27ed744fc2bf564201744897e7a44fdb76a98&w=2000"
                )
            )
            add(
                Continent(
                    "America",
                    "https://c8.alamy.com/comp/E848FW/united-states-of-america-political-map-E848FW.jpg"
                )
            )
            add(
                Continent(
                    "Australia",
                    "https://www.mappr.co/wp-content/uploads/2024/01/australia-states-map.jpg"
                )
            )
            add(
                Continent(
                    "Europe",
                    "https://european-union.europa.eu/sites/default/files/styles/embed_large_2x/public/2024-05/european-map_en.jpg?itok=PCimTmkU"
                )
            )
            add(
                Continent(
                    "Africa",
                    "https://media.istockphoto.com/id/587892720/vector/africa-single-states-political-map.jpg?s=612x612&w=0&k=20&c=kQj9qra1FOcR_G1M18xetRg9idG6cL9dH4UP1k-s5uw="
                )
            )
        }
        adapter.loadData(continents)
    }

    private fun initAdapter() {
        binding.rvContinents.adapter = adapter
    }

    fun onClick(position: Int) {
        val bundle = Bundle().apply {
            putInt("cont", position)
        }
        val countryFragment = CountryFragment().apply {
            arguments = bundle
        }
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container_view, countryFragment)
            .addToBackStack(null)
            .commit()
    }


}