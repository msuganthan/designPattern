package singleton.problematic;

import java.io.*;

public class BasicSingleton {
    private BasicSingleton() {}

    private static final BasicSingleton INSTANCE = new BasicSingleton();

    public static BasicSingleton getInstance() { return INSTANCE; }

    private int value = 0;

    public int getValue() { return value; }

    public void setValue(int value) { this.value = value; }

    public static void main(String[] args) throws Exception {
        //1. reflection
        //2. Serialization
        BasicSingleton singleton = BasicSingleton.getInstance();
        singleton.setValue(111);

        String fileName = "singleton.bin";
        saveToFile(singleton, fileName);

        singleton.setValue(222);
        BasicSingleton singleton1 = readFromFile(fileName);

        System.out.println(singleton == singleton1);
        System.out.println(singleton.getValue());
        System.out.println(singleton1.getValue());
    }

    static void saveToFile(BasicSingleton singleton, String fileName) throws Exception {
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName);
             ObjectOutputStream out = new ObjectOutputStream(fileOutputStream)) {
             out.writeObject(singleton);
        }
    }

    static BasicSingleton readFromFile(String fileName) throws Exception {
        try(FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            return (BasicSingleton) objectInputStream.readObject();
        }
    }
}
