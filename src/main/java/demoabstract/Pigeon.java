package demoabstract;

public class Pigeon extends Birds {
    public Pigeon(String name) {
        super(name);
    }

    String makeSound() {
        return "coo";
    }

    String eat() {
        return "crumbs";
    }
}
