package org.example.hw11;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // Örneğin oluşturulmasını engelleyerek private bir kurucu metod
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
