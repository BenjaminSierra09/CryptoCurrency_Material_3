package com.benjaminsierra.cryptocurrencyupdate.domain.repository

import com.benjaminsierra.cryptocurrencyupdate.data.remote.dto.CoinDetailDto
import com.benjaminsierra.cryptocurrencyupdate.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}