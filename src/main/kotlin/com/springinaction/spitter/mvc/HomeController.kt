package com.springinaction.spitter.mvc

import com.springinaction.spitter.service.SpitterService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class HomeController() {

    @Autowired
    lateinit var spitterService: SpitterService

    @RequestMapping("/", "/home")
    fun showHomePage(model: MutableMap<String, Any>): String {
        model["spittles"] = spitterService.getRecentSpittles(DEFAULT_SPITTLES_PER_PAGE)
        return "home"
    }

    companion object {
        const val DEFAULT_SPITTLES_PER_PAGE = 25;
    }
}