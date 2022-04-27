package com.springinaction.spitter.service.impl

import com.springinaction.spitter.model.Spitter
import com.springinaction.spitter.model.Spittle
import com.springinaction.spitter.service.SpitterService
import org.springframework.stereotype.Service
import java.util.*

@Service
class SpitterServiceImpl : SpitterService {

    private val spittles: List<Spittle> = mutableListOf(
        Spittle(
            "All happiness depends on a leisurely breakfast.",
            Spitter(1, "john-gunther", "password", "John Gunther"),
            Date(),
        ),
        Spittle(
            "Even in Siberia there is happiness.",
            Spitter(2, "anton-chekhov", "password", "Anton Chekhov"),
            Date(),
        ),
        Spittle(
            "The only true wisdom is in knowing you know nothing.",
            Spitter(3, "socrates", "password", "Socrates"),
            Date(),
        ),
    )

    override fun getRecentSpittles(spittlesPerPage: Int): List<Spittle> {
        return spittles
    }

    override fun getSpitter(username: String): Spitter {
        return spittles.map { it.spitter }
            .find { username == it.username } ?: throw IllegalStateException()
    }

    override fun getSpittlesForSpitter(username: String): List<Spittle> {
        return spittles.filter { username == it.spitter.username }
    }
}