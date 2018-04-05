package demoabstract;

public class Falcon extends Birds {
    public Falcon(String name) {
        super(name);
    }

    String makeSound() {
        return "screech";
    }

    String eat() {
        return "falcon food";
    }
}
