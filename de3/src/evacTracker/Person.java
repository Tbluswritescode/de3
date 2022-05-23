package evacTracker;

public class Person {

    private String name;
    private String address;

    Person(String n, String a) {
        name = n;
        address = a;
    }

    public String getAddress() {
        /* getter for string address */
        return address;
    }

    public String getName() {
        /* getter for string name */
        return name;
    }

    @Override
    public String toString() {
        String rs = "";
        rs += name + ": " + address + "\n";
        return rs;
    }

}
