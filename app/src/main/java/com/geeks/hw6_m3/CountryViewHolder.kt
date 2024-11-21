package com.geeks.hw6_m3

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.geeks.hw6_m3.databinding.ItemBinding

class CountryViewHolder(private val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(continent: Country) {
        binding.tvContinentName.text = continent.name
        Glide.with(binding.ivContinent)
            .load(continent.image)
            .centerCrop()
            .into(binding.ivContinent)
    }
}