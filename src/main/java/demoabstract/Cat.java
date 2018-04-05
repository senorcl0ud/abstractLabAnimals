package demoabstract;

public class Cat extends Feline {
    public Cat(String name) {
        super(name);
    }

    String makeSound() {
        return "meow";
    }

    String eat() {
        return "mice";
    }
}
