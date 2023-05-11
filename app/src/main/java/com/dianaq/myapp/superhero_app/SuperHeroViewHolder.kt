package com.dianaq.myapp.superhero_app

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.dianaq.myapp.databinding.ItemSuperheroBinding
import com.squareup.picasso.Picasso

class SuperHeroViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemSuperheroBinding.bind(view)

    fun bind(superHeroItemResponse: SuperHeroItemResponse, onItemSelected: (String)->Unit) {
        binding.tvSuperheroName.text = superHeroItemResponse.name
        binding.ivSuperhero
        Picasso.get().load(superHeroItemResponse.superheroImage.url).into(binding.ivSuperhero)
        binding.root.setOnClickListener { onItemSelected(superHeroItemResponse.superheroeId) }
    }
}