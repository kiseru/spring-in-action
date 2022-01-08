package com.springinaction.springidol

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.context.support.ClassPathXmlApplicationContext

class MagicianTest {
    private val thoughts = "Queen of Hearts"

    private lateinit var volunteer: Thinker

    private lateinit var magician: MindReader

    @BeforeEach
    fun setUp() {
        val ctx = ClassPathXmlApplicationContext("spring-context.xml")
        volunteer = ctx.getBean("volunteer") as Thinker
        magician = ctx.getBean("magician") as MindReader
    }

    @Test
    fun magicianShouldReadVolunteersMind() {
        volunteer.thinkOfSomething(thoughts)
        assertEquals(thoughts, magician.getThoughts())
    }
}