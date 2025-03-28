package src.bigO;

import java.util.Objects;
import java.util.UUID;

public class Singleton {

    private static Singleton INSTANCE;
    private UUID id;

    private Singleton() {
        this.id = UUID.randomUUID();
    }

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        Singleton instanceOne = Singleton.getInstance();
        Singleton instanceTow = Singleton.getInstance();
        System.out.println(instanceOne.equals(instanceTow));
        System.out.println(instanceOne.getId());
        System.out.println(instanceTow.getId());
    }

    public void print() {
        System.out.println("Singleton");
    }

    public UUID getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Singleton singleton = (Singleton) o;
        return Objects.equals(id, singleton.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
