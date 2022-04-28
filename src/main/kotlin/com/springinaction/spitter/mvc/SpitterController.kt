package com.springinaction.spitter.mvc

import com.springinaction.spitter.domain.Spitter
import com.springinaction.spitter.service.SpitterService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam

@Controller
@RequestMapping("/spitters")
class SpitterController {

    @Autowired
    lateinit var spitterService: SpitterService

    @RequestMapping(value = ["/spittles"], method = [RequestMethod.GET])
    fun listSpittlesForSpitter(@RequestParam("spitter") username: String, model: Model): String {
        val spitter = spitterService.getSpitter(username)
        model.addAttribute(spitter)
        model.addAttribute(spitterService.getSpittlesForSpitter(username))
        return "spittles/list"
    }

    @RequestMapping(method = [RequestMethod.GET], params = ["new"])
    fun createSpitterProfile(model: Model): String {
        model.addAttribute(Spitter())
        return "spitters/edit"
    }

    @RequestMapping(method = [RequestMethod.POST])
    fun addSpitterFromForm(spitter: Spitter, bindingResult: BindingResult): String {
        if (bindingResult.hasErrors()) {
            return "spitter/edit"
        }

        spitterService.saveSpitter(spitter)
        return "redirect:/spitters/${spitter.username}"
    }

    @RequestMapping(value = ["/{username}"], method = [RequestMethod.GET])
    fun showSpitterProfile(@PathVariable username: String, model: Model): String {
        model.addAttribute(spitterService.getSpitter(username))
        return "spitters/view"
    }
}