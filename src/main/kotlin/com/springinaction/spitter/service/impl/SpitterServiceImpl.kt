package com.springinaction.spitter.service.impl

import com.springinaction.spitter.domain.Spitter
import com.springinaction.spitter.domain.Spittle
import com.springinaction.spitter.persistence.SpitterDao
import com.springinaction.spitter.persistence.SpittleDao
import com.springinaction.spitter.service.SpitterService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SpitterServiceImpl : SpitterService {

    @Autowired
    lateinit var spitterDao: SpitterDao

    @Autowired
    lateinit var spittleDao: SpittleDao

    override fun getRecentSpittles(spittlesPerPage: Int): List<Spittle> {
        return spittleDao.getRecentSpittles(spittlesPerPage)
    }

    override fun getSpitter(username: String): Spitter {
        return spitterDao.getSpitterByUsername(username)
    }

    override fun getSpittlesForSpitter(username: String): List<Spittle> {
        return spittleDao.getSpittlesForSpitter(username)
    }
}