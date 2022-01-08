package com.springinaction.springidol

import org.springframework.context.support.ClassPathXmlApplicationContext

fun main() {
    val context = ClassPathXmlApplicationContext("spring-context.xml")
    val performer = context.getBean("poeticDuke") as Contestant
    performer.receiveAward()
}