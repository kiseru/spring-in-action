package com.springinaction.spitter.service

import com.springinaction.spitter.domain.Spitter
import com.springinaction.spitter.domain.Spittle

interface SpitterService {

    fun getRecentSpittles(spittlesPerPage: Int): List<Spittle>

    fun getSpitter(username: String) : Spitter

    fun getSpittlesForSpitter(username: String): List<Spittle>

    fun saveSpitter(spitter: Spitter)
}
