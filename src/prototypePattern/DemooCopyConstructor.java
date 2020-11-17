package prototypePattern;


class Addresss {
    public String stressAddress, city, country;

    public Addresss(String stressAddress, String city, String country) {
        this.stressAddress = stressAddress;
        this.city = city;
        this.country = country;
    }

    public Addresss(Addresss other) {
        this(other.stressAddress, other.city, other.country);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Addresss{");
        sb.append("stressAddress='").append(stressAddress).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", country='").append(country).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

class Employee {
    public String name;
    public Addresss address;

    public Employee(String name, Addresss address) {
        this.name = name;
        this.address = address;
    }

    public Employee(Employee other) {
        this(other.name, other.address);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("name='").append(name).append('\'');
        sb.append(", address=").append(address);
        sb.append('}');
        return sb.toString();
    }
}

public class DemooCopyConstructor {
    public static void main(String[] args) {
        Employee john = new Employee("John", new Addresss("123 London Road", "London", "UK"));
        Employee chris = new Employee(john);
        chris.name     = "chris";

        System.out.println(john);
        System.out.println(chris);
    }
}
