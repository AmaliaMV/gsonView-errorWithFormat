package gsonview.errorwithformat

import org.springframework.validation.Errors

import grails.rest.render.RendererRegistry

import org.grails.plugins.web.rest.render.json.DefaultJsonRenderer

import com.example.MimeTypes

import com.example.Pet

class BootStrap {

    RendererRegistry rendererRegistry

    def init = { servletContext ->
        Pet.findByName('Tomy') ?: new Pet(name: 'Tomy').save(flush:true)

        //rendererRegistry.addContainerRenderer(Object, new DefaultJsonRenderer(Errors, MimeTypes.MINIMAL, MimeTypes.EXPORT))
    }
    def destroy = {
    }
}
