package open.pm

/** Middle man joins project, member and role
 * If anyone of them is deleted it goes away
 * @author Pramod
 **/ 
class MemberRole {
  static belongsTo = [project: Project, person: Person, role: Role]
    static constraints = {
  }
}
