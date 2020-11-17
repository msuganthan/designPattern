package singleton;

import singleton.problematic.BasicSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public enum EnumBasedSingleton {
    INSTANCE;

    EnumBasedSingleton() {
        value = 42;
    }

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}


class Demo {
    static void saveToFile(EnumBasedSingleton singleton, String fileName) throws Exception {
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName);
             ObjectOutputStream out = new ObjectOutputStream(fileOutputStream)) {
             out.writeObject(singleton);
        }
    }

    static EnumBasedSingleton readFromFile(String fileName) throws Exception {
        try(FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            return (EnumBasedSingleton) objectInputStream.readObject();
        }
    }

    public static void main(String[] args) {
        
    }

}