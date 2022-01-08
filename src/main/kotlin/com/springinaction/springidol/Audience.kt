package com.springinaction.springidol

import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.*
import org.springframework.stereotype.Component

@Aspect
@Component
class Audience {
    @Pointcut("execution(* com.springinaction.springidol.Performer.perform(..))")
    fun performance() {
    }

    @Before("performance()")
    fun takeSeats() {
        println("The audience is taking their seats.")
    }

    @Before("performance()")
    fun turnOffCellPhones() {
        println("The audience is turning off their cellphones")
    }

    @AfterReturning("performance()")
    fun applaud() {
        println("CLAP CLAP CLAP CLAP")
    }

    @AfterThrowing("performance()")
    fun demandRefund() {
        println("Boo! We want our money back!")
    }

    @Around("performance()")
    fun watchPerformance(joinPoint: ProceedingJoinPoint) {
        try {
            println("The audience is taking their seats.")
            println("The audience is turning off their cellphones")
            val start = System.currentTimeMillis()

            joinPoint.proceed()

            val end = System.currentTimeMillis()
            println("CLAP CLAP CLAP CLAP")
            println("The performance took ${end - start} milliseconds.")
        } catch (e: Exception) {
            println("Boo! We want our money back!")
        }
    }
}