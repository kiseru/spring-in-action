package com.springinaction.springidol

import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.DeclareParents
import org.springframework.stereotype.Component

@Aspect
@Component
class ContestantIntroducer {
    companion object {
        @DeclareParents(value = "com.springinaction.springidol.Performer+", defaultImpl = GraciousContestant::class)
        lateinit var contestant: Contestant
    }
}