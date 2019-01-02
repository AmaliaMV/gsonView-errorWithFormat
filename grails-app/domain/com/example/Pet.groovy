package com.example

class Pet {

    String name

    static constraints = {
        name validator: { value ->
            return value.length() < 10
        }
    }
}
