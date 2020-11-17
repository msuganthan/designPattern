package prototypePattern;

import java.util.Arrays;

public class DemoUsingClone {
    public static void main(String[] args) throws Exception {
        Person john = new Person(new String[]{"John", "Smith"}, new Address("London Road", 123));


        Person jane = (Person)john.clone();
        jane.names[0] = "Jane";
        jane.address.houseNumber = 124;

        System.out.println(john);
        System.out.println(jane);
    }
}

class Address implements Cloneable {
    public String streetName;
    public int houseNumber;

    Address(String streetName, int houseNumber) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Address{");
        sb.append("streetName='").append(streetName).append('\'');
        sb.append(", houseNumber=").append(houseNumber);
        sb.append('}');
        return sb.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Address(this.streetName, this.houseNumber);
    }
}

class Person implements Cloneable {
    public String[] names;
    public Address address;

    Person(String[] names, Address address) {
        this.names = names;
        this.address = address;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("names=").append(Arrays.toString(names));
        sb.append(", address=").append(address);
        sb.append('}');
        return sb.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Person(names.clone(),
                            (Address) address.clone());
    }
}
