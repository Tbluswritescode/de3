package evacTracker;

import java.util.PriorityQueue;
import java.util.Set;
import java.util.HashSet;
import java.util.Collection;

public class Tracker {
    private PriorityQueue<Application> tracker;
    private Set<Application> selected;

    Tracker() {
        tracker = new PriorityQueue<Application>();
        selected = new HashSet<Application>();
    }

    public void addApplication(Application app) {
        tracker.add(app);
    }

    public Application getNext() {
        return tracker.poll();
    }

    public void selectApplication(Application app) {
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
            for (Application c : selected) {
                rs += c;
            }
        }
        return rs;
    }

    public String toStringSelected() {
        return tsAll(false);
    }

    public Collection<Application> getSelected() {
        return selected;
    }

}
