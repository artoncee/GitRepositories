package com.example.githubrepositiries.ui.repo

import com.example.githubrepositiries.data.Repos
import moxy.MvpView


interface IReposActivity: MvpView {
    fun showRepos(repos: List<Repos>)
}