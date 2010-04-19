package open.pm

/** Parts of project
 *  Team discusses and divides the project into features, with schedule completion date.
 *  Team leader inserts these features
 *  @author Pramod
 **/
class Feature {

    String description
    Date scheduleCompletion

    static belongsTo = [project: Project]

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

    /* When the feature is completed */
    def beforeUpdate() {
      if(completed) {
        completedOn = new Date()
      } else {
        // If feature is re-opened we want to set the date to null again
        completedOn = null
      }
    }

    
    static constraints = {
      description()
      scheduleCompletion()
      dateCreated()
      lastUpdated()
      completed()
      completedOn()
    }
}
