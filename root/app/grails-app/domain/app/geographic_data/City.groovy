package app.geographic_data

import grails.compiler.GrailsCompileStatic
import org.grails.gorm.graphql.entity.dsl.GraphQLMapping

@GrailsCompileStatic
class City {

    String name

    static graphql = GraphQLMapping.build {
        operations.all.enabled true
    }

    static constraints = {
    }
}
