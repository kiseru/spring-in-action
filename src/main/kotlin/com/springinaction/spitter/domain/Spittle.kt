package com.springinaction.spitter.domain

import java.util.Date
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Entity
open class Spittle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var text: String? = null

    @ManyToOne
    @JoinColumn(name = "spitter_id", nullable = false)
    var spitter: Spitter? = null

    var `when`: Date? = null
}