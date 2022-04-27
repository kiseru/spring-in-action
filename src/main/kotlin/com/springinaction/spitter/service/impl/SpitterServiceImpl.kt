package com.springinaction.spitter.service.impl

import com.springinaction.spitter.model.Spitter
import com.springinaction.spitter.model.Spittle
import com.springinaction.spitter.service.SpitterService
import org.springframework.stereotype.Service
import java.util.*

@Service
class SpitterServiceImpl : SpitterService {

    override fun getRecentSpittles(spittlesPerPage: Int): List<Spittle> {
        return listOf(
            Spittle(
                "All happiness depends on a leisurely breakfast.",
                Spitter(1, "john-gunther", "password", "John Gunther"),
                Date(),
            ),
            Spittle("Even in Siberia there is happiness.", Spitter(2, "anton-chekhov", "password", "Anton Chekhov"), Date()),
            Spittle("The only true wisdom is in knowing you know nothing.", Spitter(3, "socrates", "password", "Socrates"), Date()),
        )
    }
}