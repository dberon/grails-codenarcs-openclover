package app.graphql

import org.grails.gorm.graphql.plugin.DefaultGraphQLContextBuilder
import org.grails.web.servlet.mvc.GrailsWebRequest
import org.springframework.beans.factory.annotation.Autowired
import grails.plugin.springsecurity.SpringSecurityService

class MyGraphQLContextBuilder extends DefaultGraphQLContextBuilder {

    @Autowired
    SpringSecurityService springSecurityService

    @Override
    Map buildContext(GrailsWebRequest request) {
        Map context = super.buildContext(request)
        context.springSecurityService = springSecurityService
        context
    }
}