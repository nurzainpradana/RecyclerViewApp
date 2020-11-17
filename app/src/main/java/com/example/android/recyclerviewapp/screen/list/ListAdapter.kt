package com.example.android.recyclerviewapp.screen.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.android.recyclerviewapp.data.Menu
import com.example.android.recyclerviewapp.databinding.ItemMenusBinding

class ListAdapter private constructor(val binding: ItemMenusBinding) : ViewHolder(binding.root){
    fun bind(
        item: Menu
    ) {
        binding.menu = item
        binding.executePendingBindings()
    }

    companion object {
        fun from(parent: ViewGroup) : ViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = ItemMenusBinding.inflate(layoutInflater, parent, false)
            return ViewHolder(binding)
        }
    }

}