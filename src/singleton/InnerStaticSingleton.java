package singleton;

public class InnerStaticSingleton {
    public InnerStaticSingleton() {
    }

    private static class Impl {
        private static final InnerStaticSingleton INSTANCE = new InnerStaticSingleton();
    }

    public InnerStaticSingleton getInstance {
        return Impl.INSTANCE;
    }
}
