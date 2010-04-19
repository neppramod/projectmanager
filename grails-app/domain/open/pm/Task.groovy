package open.pm

/**
 * It is the core of the project
 * Every team members creates one for every hour work or say
 * lots and lots of task are done task are done to complete a feature
 * Main target is to create a sequential list of tasks or work to complete the feature
 * @author Pramod
 **/

class Task {
  String description

    /* If date is inappropriate time will come */
    Date scheduleCompletion

    static belongsTo = [feature: Feature, person: Person]

    Date dateCreated    /* dateCreated and lastUpdated will be inserted or updated by itself */
    Date lastUpdated    /* no need to insert or update any value */

    boolean completed
    Date completedOn

  /* On the time of project creation if completed is true task is completed at that time */
    def beforeInsert() {
      if(completed) {
        completedOn = new Date()
      }
    }

    /* When the task is completed */
    def beforeUpdate() {
      if(completed) {
        completedOn = new Date()
      } else {
        // If task is re-opened we want to set the date to null again
        completedOn = null
      }
    }

    static constraints = {
      description()
      scheduleCompletion()
      completedOn()
    }
}
