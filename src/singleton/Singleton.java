package singleton;

public class Singleton {

    private static volatile Singleton instance;
    private String value;

    private Singleton(String value) {
        this.value = value;
    }
    public static Singleton getInstance(String value) {
        /**
         * The approach taken here is the double checked locking(DCL). It exist to prevent the
         * race condition between multiple threads that may attempt to get singleton instance
         * at the same time, creating separate instance as a result.
         *
         * It may seem that having the result variable here is pointless. There is, however,
         * the very important caveat, when implementing double checked locking in Java, which
         * is solved by introducing the local variable.
         *
         * https://en.wikipedia.org/wiki/Double-checked_locking#Usage_in_Java
         */

        Singleton singleton = instance;
        if (singleton != null)
            return singleton;
        synchronized (Singleton.class) {
            if (instance == null)
                instance = new Singleton(value);
            return instance;
        }
    }

    public String getValue() {
        return value;
    }
}
