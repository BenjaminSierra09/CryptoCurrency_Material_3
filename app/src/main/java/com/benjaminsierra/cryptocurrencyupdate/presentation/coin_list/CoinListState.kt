package com.benjaminsierra.cryptocurrencyupdate.presentation.coin_list

import com.benjaminsierra.cryptocurrencyupdate.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
