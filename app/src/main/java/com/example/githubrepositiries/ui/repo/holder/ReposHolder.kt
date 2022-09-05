package com.example.githubrepositiries.ui.repo.holder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.githubrepositiries.data.Repos
import com.example.githubrepositiries.databinding.RepoItemBinding

class ReposHolder private constructor(private val binding: RepoItemBinding): RecyclerView.ViewHolder(binding.root) {

    companion object {
        fun create(parent: ViewGroup): ReposHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = RepoItemBinding.inflate(layoutInflater, parent, false)
            return ReposHolder(binding)
        }
    }

    fun bind(item: Repos) {
        binding.nameTextView.text = item.name
        binding.updateTextView.text=item.date
        binding.descriptionTextView.text=item.description
        binding.starsTextView.text=item.stars
        binding.languageTextView.text=item.language
        binding.brunchTextView.text=item.brunch
    }

}