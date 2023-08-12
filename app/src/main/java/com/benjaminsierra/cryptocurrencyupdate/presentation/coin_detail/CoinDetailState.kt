package com.benjaminsierra.cryptocurrencyupdate.presentation.coin_detail

import com.benjaminsierra.cryptocurrencyupdate.domain.model.Coin
import com.benjaminsierra.cryptocurrencyupdate.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
