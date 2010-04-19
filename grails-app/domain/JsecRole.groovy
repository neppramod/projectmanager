class JsecRole {
    String name

    static constraints = {
        name(nullable: false, blank: false, unique: true)
    }

    String toString() {
      return name
    }
}