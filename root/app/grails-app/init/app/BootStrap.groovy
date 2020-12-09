package app

import app.security.Role
import app.security.User

class BootStrap {

    def init = { servletContext ->
        User.withNewTransaction {
            User user = new User(username: 'client', password: 'client')
            user.save(flush: true)
            Role.withNewTransaction {
                Role role = new Role(authority: 'ROLE_CLIENT')
                role.save(flush: true)
            }
        }
    }
    def destroy = {
    }
}
