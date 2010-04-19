class JsecUser {
    String username
    String passwordHash

    static constraints = {
        username(nullable: false, blank: false)
    }

    String toString() {
      return username  
    }
}
