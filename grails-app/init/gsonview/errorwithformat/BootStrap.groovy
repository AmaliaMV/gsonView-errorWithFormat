package gsonview.errorwithformat

import com.example.Pet

class BootStrap {

    def init = { servletContext ->
        Pet.findByName('Tomy') ?: new Pet(name: 'Tomy').save(flush:true)
    }
    def destroy = {
    }
}
