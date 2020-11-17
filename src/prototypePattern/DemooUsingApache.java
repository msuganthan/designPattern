package prototypePattern;

import org.apache.commons.lang3.SerializationUtils;

import java.io.Serializable;

public class DemooUsingApache {

    public static void main(String[] args) {
        Foo foo = new Foo(123, "whatever");
        Foo other = SerializationUtils.roundtrip(foo);
        other.whatever = "Boo";

        System.out.println(foo);
        System.out.println(other);
    }
}

class Foo implements Serializable {
    public int stuff;
    public String whatever;

    public Foo(int stuff, String whatever) {
        this.stuff = stuff;
        this.whatever = whatever;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Foo{");
        sb.append("stuff=").append(stuff);
        sb.append(", whatever='").append(whatever).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
