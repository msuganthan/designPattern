package singleton;

public class SingleTonTest {

    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (boo!!)" + "\n\n" +
                "RESULT:" + "\n");

        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBoo = new Thread(new ThreadBoo());
        threadFoo.start();
        threadBoo.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("FOO");
            System.out.println(singleton.getValue());
        }
    }

    static class ThreadBoo implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("BOO");
            System.out.println(singleton.getValue());
        }
    }
}
