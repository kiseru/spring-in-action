package com.springinaction.springidol

import org.springframework.beans.factory.annotation.Qualifier

@Retention(AnnotationRetention.RUNTIME)
@Target(
    AnnotationTarget.FIELD,
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.CLASS,
    AnnotationTarget.PROPERTY,
)
@Qualifier
annotation class PianoInstrument
