package com.geeks.hw6_m3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.geeks.hw6_m3.databinding.ItemBinding

class CountryAdapter(private val onItemClick: (position: Int) -> Unit) :
RecyclerView.Adapter<CountryViewHolder>() {

    private var list: ArrayList<Country> = arrayListOf()

    fun loadData(listCountry: ArrayList<Country>) {
        list = listCountry
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val binding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CountryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.bind(list[position])
        holder.itemView.setOnClickListener {
            onItemClick(position)
        }
    }

    override fun getItemCount(): Int = list.size
}
