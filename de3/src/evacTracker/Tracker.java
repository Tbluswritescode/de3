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

    Tracker() {
        tracker = new PriorityQueue<Application>();
        selected = new HashSet<Application>();
    }

    Tracker(Set<Application> s) {
        tracker = new PriorityQueue<Application>(s);
        selected = new HashSet<Application>();

    }

    public void addApplication(Application app) {
        tracker.add(app);
    }

    public Set<Application> findSelectedByName(String name) {
        Set<Application> s = new HashSet<Application>();
        for (Application a : selected) {
            if (a.getPersonName() == name) {
                s.add(a);
            }
        }
        return s;
    }

    public Application getNext() {
        return tracker.poll();
    }

    Comparator<Application> compareByName = (Application a1, Application a2) -> a1.getPersonName()
            .compareTo(a2.getPersonName());

    public Collection<Application> getAllSelected() {
        List<Application> sortedList = new ArrayList<Application>(selected);
        Collections.sort(sortedList, compareByName);
        return sortedList;
    }

    public void acceptApplication(Application app) {
        selected.add(app);
    }

    @Override
    public String toString() {
        return tsAll(true);
    }

    private String tsAll(boolean b) {
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
        return tsAll(false);
    }

    public Collection<Application> getSelected() {
        return new HashSet<Application>(selected);
    }

}
