package builderPattern;

public class Demo2 {
    public static void main(String[] args) {
        Person1Builder builder = new Person1Builder();
        Person1 person1 = builder
                            .lives()
                                .at("123 London Road")
                                .in("London")
                                .withPostCode("SW12BC")
                            .works()
                                .at("FabriKam")
                                .asA("Engineer")
                                .earning(123000)
                            .build();
        System.out.println(person1);
    }
}

class Person1 {
    public String streetAddress, postCode, city;

    public String companyName, position;
    public int annualIncome;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person1{");
        sb.append("streetAddress='").append(streetAddress).append('\'');
        sb.append(", postcode='").append(postCode).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", companyName='").append(companyName).append('\'');
        sb.append(", position='").append(position).append('\'');
        sb.append(", annualIncome=").append(annualIncome);
        sb.append('}');
        return sb.toString();
    }
}

//builder Facade
class Person1Builder {
    protected Person1 person1 = new Person1();

    public PersonAddressBuilder lives() {
        return new PersonAddressBuilder(person1);
    }

    public PersonJobBuilder works() {
        return new PersonJobBuilder(person1);
    }
    public Person1 build() {
        return person1;
    }
}

class PersonAddressBuilder extends Person1Builder {
    public PersonAddressBuilder (Person1 person1) {
        this.person1 = person1;
    }

    public PersonAddressBuilder at(String streetAddress) {
        person1.streetAddress = streetAddress;
        return this;
    }

    public PersonAddressBuilder withPostCode(String postCode) {
        person1.postCode = postCode;
        return this;
    }

    public PersonAddressBuilder in(String city) {
        person1.city = city;
        return this;
    }

}

class PersonJobBuilder extends Person1Builder {
    public PersonJobBuilder (Person1 person1) {
        this.person1 = person1;
    }

    public PersonJobBuilder at(String companyName) {
        person1.companyName = companyName;
        return this;
    }

    public PersonJobBuilder asA(String position) {
        person1.position = position;
        return this;
    }

    public PersonJobBuilder earning(int annualIncome) {
        person1.annualIncome = annualIncome;
        return this;
    }

}