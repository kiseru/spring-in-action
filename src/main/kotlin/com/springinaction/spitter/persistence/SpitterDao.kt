package com.springinaction.spitter.persistence

import com.springinaction.spitter.domain.Spitter

interface SpitterDao {

    fun addSpitter(spitter: Spitter)

    fun getSpitterById(id: Long): Spitter

    fun saveSpitter(spitter: Spitter)

    fun getSpitterByUsername(username: String): Spitter
}