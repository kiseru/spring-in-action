package com.springinaction.spitter.persistence

import com.springinaction.spitter.domain.Spittle

interface SpittleDao {

    fun getSpittlesForSpitter(username: String): List<Spittle>

    fun getRecentSpittles(spittlesPerPage: Int): List<Spittle>
}