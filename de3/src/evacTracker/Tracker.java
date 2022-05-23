package evacTracker;

import java.util.PriorityQueue;
import java.util.Set;
import java.util.HashSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class Tracker {
    private PriorityQueue<Application> tracker;
    private Set<Application> selected;

    /* comparator for sorting selected application before returning them */
    private Comparator<Application> compareByName = (Application a1, Application a2) -> a1.getPersonName()
            .compareTo(a2.getPersonName());

    Tracker() {
        tracker = new PriorityQueue<Application>();
        selected = new HashSet<Application>();
    }

    Tracker(Set<Application> s) {
        /* allows for quick tracker population, mostly for testing */
        tracker = new PriorityQueue<Application>(s);
        selected = new HashSet<Application>();

    }

    public void addApplication(Application app) {
        /* adds a single application to the tracker */
        tracker.add(app);
    }

    public Set<Application> findSelectedByName(String name) {
        /* returns a set of the applications matching a given name */
        Set<Application> s = new HashSet<Application>();
        for (Application a : selected) {
            if (a.getPersonName() == name) {
                s.add(a);
            }
        }
        return s;
    }

    public Application getNext() {
        /* gives the next application in the queue for review */
        return tracker.poll();
    }

    public Collection<Application> getAllSelected() {
        /*
         * returns a collection of all the selected applications, since it needs to be
         * sorted
         * this collection will be converted to a list and sorted before return
         */
        List<Application> sortedList = new ArrayList<Application>(selected);
        Collections.sort(sortedList, compareByName);
        return sortedList;
    }

    public void acceptApplication(Application app) {
        /*
         * if an application is accepted it is added to selected
         * if it is not accepted it will have been polled by getNext and will be ignored
         */

        selected.add(app);
    }

    @Override
    public String toString() {
        /* simple toString using a helper method */
        return tsAll(true);
    }

    private String tsAll(boolean b) {
        /* toString helper method */
        String rs = "";
        if (b) {
            for (Application a : tracker) {
                rs += a;
            }
        } else {
            for (Application c : getAllSelected()) {
                rs += c;
            }
        }
        return rs;
    }

    public String toStringSelected() {
        /* to string using helper method to get selected */
        return tsAll(false);
    }

}
