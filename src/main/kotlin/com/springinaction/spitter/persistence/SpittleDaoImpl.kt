package com.springinaction.spitter.persistence

import com.springinaction.spitter.domain.Spittle
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

@Repository
@Transactional
class SpittleDaoImpl : SpittleDao {

    @PersistenceContext
    lateinit var em: EntityManager

    @Suppress("UNCHECKED_CAST")
    override fun getSpittlesForSpitter(username: String): List<Spittle> {
        return em.createQuery("select s from Spittle s join s.spitter as s1 where s1.username = :username")
            .setParameter("username", username)
            .resultList as List<Spittle>
    }

    @Suppress("UNCHECKED_CAST")
    override fun getRecentSpittles(spittlesPerPage: Int): List<Spittle> {
        return em.createQuery("select s from Spittle s")
            .setMaxResults(spittlesPerPage)
            .resultList as List<Spittle>
    }
}