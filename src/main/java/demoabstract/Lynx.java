package demoabstract;

public class Lynx extends Feline {
    public Lynx(String name) {
        super(name);
    }

    String makeSound() {
        return "growl";
    }

    String eat() {
        return "cats";
    }
}
