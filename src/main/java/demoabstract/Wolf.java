package demoabstract;

public class Wolf extends Canine {
    public Wolf(String name) {
        super(name);
    }

    String makeSound() {
        return "howl";
    }

    String eat() {
        return "deer";
    }
}
