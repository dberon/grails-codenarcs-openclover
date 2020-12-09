package app

@SuppressWarnings(['UnnecessaryGString'])
class UrlMappings {

    static mappings = {
        delete "/$controller/$id(.$format)?"(action:"delete")
        get "/$controller(.$format)?"(action:"index")
        get "/$controller/$id(.$format)?"(action:"show")
        post "/$controller(.$format)?"(action:"save")
        put "/$controller/$id(.$format)?"(action:"update")
        patch "/$controller/$id(.$format)?"(action:"patch")

        "/swagger/endpoint"(controller: "swagger", action: "api")
        "/dummy"(controller: "dummy", action: "index")
//        "/graphql/browser"(controller: "graphql", action: "browser")
        "/graphql" (controller: "graphql", action: "index")
        "/graphql/browser" (controller: "graphql", action: "browser")
        "/"(controller: 'application', action:'index')
        "500"(view: '/error')
        "404"(view: '/notFound')
    }

}
