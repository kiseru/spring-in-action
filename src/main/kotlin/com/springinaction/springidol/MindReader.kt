package com.springinaction.springidol

interface MindReader {
    fun interceptThoughts(thoughts: String)

    fun getThoughts(): String?
}