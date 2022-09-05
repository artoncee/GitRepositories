package com.example.githubrepositiries.di

import com.example.githubrepositiries.utils.Utils
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val utilsModule = module {
    single { Utils(androidContext()) }
}