package com.example.githubrepositiries.ui.repo.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.githubrepositiries.data.Repos
import com.example.githubrepositiries.ui.repo.holder.ReposHolder
import com.example.githubrepositiries.utils.replaceWith

class ReposAdapter(): RecyclerView.Adapter<ReposHolder>() {

    private val items = mutableListOf<Repos>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ReposHolder.create(parent)

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: ReposHolder, position: Int) {
        holder.bind(items[position])
    }
    fun setItems(items: List<Repos>) {
        this.items.replaceWith(items)
        notifyDataSetChanged()
    }
}