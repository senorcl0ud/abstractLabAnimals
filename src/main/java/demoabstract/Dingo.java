package demoabstract;

public class Dingo extends Canine {
    public Dingo(String name) {
        super(name);
    }

    String makeSound() {
        return "bark";
    }

    String eat() {
        return "dingo food";
    }
}
