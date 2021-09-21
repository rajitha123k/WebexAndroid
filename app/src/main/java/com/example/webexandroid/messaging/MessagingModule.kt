package com.example.webexandroid.messaging

import com.example.webexandroid.messaging.spaces.SpacesRepository
import com.example.webexandroid.messaging.spaces.SpacesViewModel
import com.example.webexandroid.messaging.spaces.detail.SpaceDetailViewModel
import com.example.webexandroid.messaging.spaces.members.MembershipRepository
import com.example.webexandroid.messaging.teams.TeamsRepository
import com.example.webexandroid.messaging.teams.TeamsViewModel
import com.example.webexandroid.messaging.teams.membership.TeamMembershipRepository
import com.example.webexandroid.messaging.teams.membership.TeamMembershipViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val messagingModule = module {
    viewModel { TeamsViewModel(get(), get()) }
    viewModel { TeamMembershipViewModel(get()) }

    single { TeamsRepository(get()) }


    viewModel { SpacesViewModel(get(), get(), get(), get()) }
    viewModel { SpaceDetailViewModel(get(), get()) }

    single { SpacesRepository(get()) }

    single { MembershipRepository(get()) }

    single { TeamMembershipRepository(get()) }
}