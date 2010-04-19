package open.pm

/**
 * A normal user.
 * def userRole = new JsecRole(name: "User").save()
 * def normalUser = new JsecUser(username: "phil", passwordHash: new Sha1Hash("password").toHex()).save()
 * new JsecUserRoleRel(user: normalUser, role: userRole).save()
 * @author Pramod
 **/

class Person {
	String name
	JsecRole loginRole
	JsecUser login

	String toString() {
		return name
	}
}
