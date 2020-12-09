import app.graphql.MyGraphQLContextBuilder
import app.graphql.MyGraphQLCustomizer
import app.security.UserPasswordEncoderListener
// Place your Spring DSL code here
beans = {
    userPasswordEncoderListener(UserPasswordEncoderListener)
    myGraphQLCustomizer(MyGraphQLCustomizer)
    graphQLContextBuilder(MyGraphQLContextBuilder)
}
