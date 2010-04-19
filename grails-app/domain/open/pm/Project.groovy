package open.pm

/** Project informations
 * Independent of any thing.
 * Helps to track when the project started and when it was completed
 * @author Pramod
 **/

class Project {

    String name
    String description
    Integer workDaysPerWeek
    Integer workHoursPerDay
    Date scheduleCompletion

    Date dateCreated    /* dateCreated and lastUpdated will be inserted or updated by itself */
    Date lastUpdated    /* no need to insert or update any value */

    boolean completed
    Date completedOn

    /* On the time of project creation if completed is true project is completed at that time */
    def beforeInsert() {
      if(completed) {
        completedOn = new Date()
      }
    }

    /* When the project is completed */
    def beforeUpdate() {
      if(completed) {
        completedOn = new Date()        
      }else {
        // If project is re-opened we want to set the date to null again
        completedOn = null
      }
    }

    static constraints = {
      name()
      scheduleCompletion()
      description()
      lastUpdated()      
      completedOn()
    }
}
