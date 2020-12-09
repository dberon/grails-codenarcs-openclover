package app.graphql

import app.geographic_data.City
import org.grails.gorm.graphql.interceptor.manager.GraphQLInterceptorManager
import org.grails.gorm.graphql.plugin.GraphQLPostProcessor

class MyGraphQLCustomizer extends GraphQLPostProcessor {

    @Override
    void doWith(GraphQLInterceptorManager interceptorManager){
        interceptorManager.registerInterceptor(City, new CityInterceptor())
    }
}
