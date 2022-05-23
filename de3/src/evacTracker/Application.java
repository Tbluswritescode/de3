package evacTracker;

import java.util.Date;

public class Application implements Comparable<Application> {
    private Date applicationDate;
    private Person person;

    Application() {
        applicationDate = new Date(System.currentTimeMillis());
    }

    Application(Person p) {
        person = p;
        applicationDate = new Date(System.currentTimeMillis());
    }

    public Date getDate() {
        return applicationDate;
    }

    public String getAddress() {
        return person.getAddress();
    }

    public void setPerson(Person p) {
        person = p;
    }

    public String getPersonName() {
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
        return this.applicationDate.compareTo(app.applicationDate);
    }
}
