package demoabstract;

public class Eagle extends Birds {
    public Eagle(String name) {
        super(name);
    }

    String makeSound() {
        return "kaw";
    }

    String eat() {
        return "rabbits";
    }
}
