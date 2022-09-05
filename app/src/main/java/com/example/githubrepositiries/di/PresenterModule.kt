package com.example.githubrepositiries.di

import com.example.githubrepositiries.ui.repo.ReposPresenter
import org.koin.dsl.module

val  presenterModule = module {
    factory { ReposPresenter() }
}