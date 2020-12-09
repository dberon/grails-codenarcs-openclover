package app

import grails.plugin.springsecurity.annotation.Secured
import grails.rest.*
import grails.converters.*


class DummyController {
    static responseFormats = ['json', 'xml']

    @Secured(['permitAll'])
    def index() {
        String message = 'Dummy text modified'
        render message
    }

}


