package com.springinaction.spitter.service

import com.springinaction.spitter.model.Spittle

interface SpitterService {

    fun getRecentSpittles(spittlesPerPage: Int): List<Spittle>
}
