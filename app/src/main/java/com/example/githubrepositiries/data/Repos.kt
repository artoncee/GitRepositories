package com.example.githubrepositiries.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.util.*

@Parcelize
data class Repos(val name: String,
                 val date: String,
                 val description: String,
                 val stars: String,
                 val language: String,
                 val brunch: String): Parcelable
