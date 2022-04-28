package com.springinaction.spitter.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
open class Spitter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    var username: String? = null

    var password: String? = null
    
    var fullName: String? = null

    var email: String? = null

    var updateByEmail: Boolean = false
}