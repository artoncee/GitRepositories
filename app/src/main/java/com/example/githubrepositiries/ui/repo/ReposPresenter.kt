package com.example.githubrepositiries.ui.repo

import com.example.githubrepositiries.data.Repos
import moxy.MvpPresenter

class ReposPresenter : MvpPresenter<IReposActivity>() {
    private lateinit var reposList: List<Repos>
    private val repos= listOf(
        Repos(name = "Name", date = "31-07-2022", description = "DDDDDDDDD", stars = "3", language = "C++", brunch="1"),
        Repos(name = "Name", date = "31-07-2022", description = "DDDDDDDDD", stars = "3", language = "C++", brunch="1"),
        Repos(name = "Name", date = "31-07-2022", description = "DDDDDDDDD", stars = "3", language = "C++", brunch="1"))

    override fun onFirstViewAttach() {
        reposList=repos
        viewState.showRepos(reposList)
    }
}