package com.springinaction.spitter.persistence

import com.springinaction.spitter.domain.Spitter
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

@Repository
@Transactional
class JdbcSpitterDao : SpitterDao {

    @PersistenceContext
    lateinit var em: EntityManager

    override fun addSpitter(spitter: Spitter) {
        em.persist(spitter)
    }

    override fun saveSpitter(spitter: Spitter) {
        em.merge(spitter)
    }

    override fun getSpitterById(id: Long): Spitter {
        return em.find(Spitter::class.java, id)
    }

    override fun getSpitterByUsername(username: String): Spitter {
        return em.createQuery("select s from Spitter s where s.username = :username")
            .setParameter("username", username)
            .singleResult as Spitter
    }
}