package com.geeks.hw6_m3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.geeks.hw6_m3.databinding.ItemBinding

class ContinentAdapter(private val onClick: (position: Int) -> Unit) :
    Adapter<ContinentViewHolder>() {

    private var list = emptyList<Continent>()

    fun loadData(listContinent: List<Continent>) {
        list = listContinent
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContinentViewHolder {
        return ContinentViewHolder(
            ItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: ContinentViewHolder, position: Int) {
        holder.bind(list[position])
        holder.itemView.setOnClickListener{
            onClick(position)
        }
    }
}

class ContinentViewHolder(private var binding: ItemBinding) : ViewHolder(binding.root) {

    fun bind(continent: Continent) {
        binding.tvContinentName.text = continent.name
        binding.ivContinent
        Glide.with(binding.ivContinent.context)
            .load(continent.image)
            .centerCrop()
            .into(binding.ivContinent)
    }
}