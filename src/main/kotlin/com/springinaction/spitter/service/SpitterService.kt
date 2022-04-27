package com.springinaction.spitter.service

import com.springinaction.spitter.model.Spitter
import com.springinaction.spitter.model.Spittle

interface SpitterService {

    fun getRecentSpittles(spittlesPerPage: Int): List<Spittle>

    fun getSpitter(username: String) : Spitter

    fun getSpittlesForSpitter(username: String): List<Spittle>
}
