package evacTracker;

import java.util.Date;

public class Application implements Comparable<Application> {
    private Date applicationDate;
    private Person person;

    Application() {
        applicationDate = new Date(System.currentTimeMillis());
    }

    Application(Person p) {
        /* override to allow creation with an instantiated Person object */
        person = p;
        applicationDate = new Date(System.currentTimeMillis());
    }

    public Date getDate() {
        /* getter for Date application Date */
        return applicationDate;
    }

    public String getAddress() {
        /* getter for string address */
        return person.getAddress();
    }

    public void setPerson(Person p) {
        /* setter for person object */
        person = p;
    }

    public String getPersonName() {
        /* getter for string name */
        return person.getName();
    }

    @Override
    public String toString() {
        String rs = "";
        rs += "Applied on " + applicationDate + ": " + person;
        return rs;
    }

    @Override
    public int compareTo(Application app) {
        /* comparator for priority queue ordering */
        return this.applicationDate.compareTo(app.applicationDate);
    }
}
