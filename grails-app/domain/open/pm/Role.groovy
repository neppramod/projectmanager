package open.pm

/**
 * Role within the project E.g Developer, Team Leader , Architect, Worker etc
 * @author Pramod
 **/

class Role {
  String name
  String description

    static constraints = {
    }

    String toString() {
      return name + " - " + description
    }
}
