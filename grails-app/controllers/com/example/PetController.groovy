package com.example


import grails.rest.*
import grails.converters.*

class PetController {

    static responseFormats = ['json', 'minimal', 'export']

    def index() {
        respond Pet.getAll()
    }

    def show() {
        respond Pet.get(params.id)
    }

    def validate(Pet pet) {
        pet.validate()
        respond pet
    }

}
