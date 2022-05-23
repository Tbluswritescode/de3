package evacTracker;

public class Person {

    private String name;
    private String address;

    Person(String n, String a) {
        name = n;
        address = a;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        String rs = "";
        rs += name + ": " + address + "\n";
        return rs;
    }

}
