package com.springinaction.spitter.mvc

import com.springinaction.spitter.service.SpitterService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam

@Controller
@RequestMapping("/spitter")
class SpitterController {

    @Autowired
    lateinit var spitterService: SpitterService

    @RequestMapping(value=["/spittles"], method = [RequestMethod.GET])
    fun listSpittlesForSpitter(@RequestParam("spitter") username: String, model: Model): String {
        val spitter = spitterService.getSpitter(username)
        model.addAttribute(spitter)
        model.addAttribute(spitterService.getSpittlesForSpitter(username))
        return "spittles/list"
    }
}