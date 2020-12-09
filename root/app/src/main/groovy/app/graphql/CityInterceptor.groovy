package app.graphql

import app.security.User
import grails.plugin.springsecurity.SpringSecurityService
import graphql.schema.DataFetchingEnvironment

import org.grails.gorm.graphql.fetcher.GraphQLDataFetcherType
import org.grails.gorm.graphql.interceptor.impl.BaseGraphQLFetcherInterceptor


class CityInterceptor extends BaseGraphQLFetcherInterceptor{

    @Override
    boolean onQuery(DataFetchingEnvironment environment, GraphQLDataFetcherType type) {
        Map context = (Map) environment.context
        SpringSecurityService springSecurityService = (SpringSecurityService) context.springSecurityService
        springSecurityService.currentUser == User.get(1)
        true
    }

}
