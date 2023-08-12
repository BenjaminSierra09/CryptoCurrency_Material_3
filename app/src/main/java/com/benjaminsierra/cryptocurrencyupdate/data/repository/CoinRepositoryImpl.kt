package com.benjaminsierra.cryptocurrencyupdate.data.repository

import com.benjaminsierra.cryptocurrencyupdate.data.remote.CoinPaprikaApi
import com.benjaminsierra.cryptocurrencyupdate.data.remote.dto.CoinDetailDto
import com.benjaminsierra.cryptocurrencyupdate.data.remote.dto.CoinDto
import com.benjaminsierra.cryptocurrencyupdate.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}