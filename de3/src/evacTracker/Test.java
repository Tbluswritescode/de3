package evacTracker;

import java.util.Set;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        Set<Application> s = new HashSet<Application>();
        try {
            s = genApps(10);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Tracker t = new Tracker(s);

        for (int i = 0; i < 10; i++) {
            Application a = t.getNext();
            t.acceptApplication(a);
            System.out.println(a);
        }

        System.out.println(t.findSelectedByName("John Dough3"));
        System.out.println(t.toStringSelected());
    }

    public static Set<Application> genApps(int count) throws InterruptedException {
        Set<Application> s = new HashSet<Application>();
        for (int i = 0; i < count; i++) {
            Person p = new Person("John Dough" + i, "123" + i + " maple street");
            Application a = new Application(p);
            s.add(a);
            TimeUnit.SECONDS.sleep(1);
        }
        return s;
    }
}
