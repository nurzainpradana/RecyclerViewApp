package com.example.android.recyclerviewapp.screen.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.android.recyclerviewapp.data.Menu
import com.example.android.recyclerviewapp.databinding.ItemMenusBinding

class ListAdapter : RecyclerView.Adapter<ListAdapter.ViewHolder>(){
    var data: List<Menu> = listOf()

    class ViewHolder private constructor(val binding: ItemMenusBinding) : RecyclerView.ViewHolder(binding.root){
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

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }
}