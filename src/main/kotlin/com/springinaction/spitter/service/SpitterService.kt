package com.springinaction.spitter.service

import org.springframework.stereotype.Service

@Service
class SpitterService {

    fun getRecentSpittles(spittlesPerPage: Int): List<Any> {
        val result = mutableListOf<Int>()
        for (i in 0..spittlesPerPage) {
            result.add(i)
        }
        return result
    }
}
