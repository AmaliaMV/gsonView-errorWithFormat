package com.example

import grails.plugins.rest.client.RestBuilder
import grails.testing.mixin.integration.Integration
import grails.transaction.Rollback

import geb.spock.GebSpec


@Integration
@Rollback
class PetControllerIntegrationSpec extends GebSpec {

    void "test validate a property without format"() {
        when:
        def resp = restBuilder().post("$baseUrl/pet/validate") {
            json ([name: 'invalid name'])
        }

        then:
        resp.status == 422
        resp.json.errors[0].field == "name"

    }

    void "test validate a property with specific format"() {
        when:
        def resp = restBuilder().post("$baseUrl/pet/validate?format=minimal") {
            json ([name: 'invalid name'])
        }

        then:
        resp.status == 422
        resp.json.errors[0].field == "name"
    }

    RestBuilder restBuilder() {
        new RestBuilder()
    }
}
