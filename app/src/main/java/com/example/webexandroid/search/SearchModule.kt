package com.example.webexandroid.search

import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val searchModule = module {
    viewModel {
        SearchViewModel(get(), get(), get())
    }
    single { SearchRepository(get()) }
}