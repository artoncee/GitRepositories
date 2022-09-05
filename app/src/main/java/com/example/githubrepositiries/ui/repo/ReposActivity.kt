package com.example.githubrepositiries.ui.repo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.githubrepositiries.R
import com.example.githubrepositiries.data.Repos
import com.example.githubrepositiries.databinding.ActivityReposBinding
import com.example.githubrepositiries.ui.repo.adapter.ReposAdapter
import moxy.MvpAppCompatActivity
import moxy.ktx.moxyPresenter
import org.koin.android.ext.android.get

class ReposActivity: MvpAppCompatActivity(), IReposActivity {

    private lateinit var adapter: ReposAdapter
    private lateinit var layoutManager: LinearLayoutManager
    private val presenter by moxyPresenter { get<ReposPresenter>() }
    private lateinit var binding: ActivityReposBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityReposBinding.inflate(layoutInflater)
        setContentView(binding.root)
        layoutManager = LinearLayoutManager(this)
        adapter = ReposAdapter()
        binding.recyclerView.layoutManager = layoutManager
        binding.recyclerView.adapter = adapter
    }

    override fun showRepos(repos: List<Repos>) {
        adapter.setItems(repos)
    }
}