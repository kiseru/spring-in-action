package com.springinaction.spitter.model

import java.util.Date

data class Spittle(
    var text: String,
    var spitter: Spitter,
    var `when`: Date,
)