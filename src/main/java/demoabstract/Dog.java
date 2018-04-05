package demoabstract;

public class Dog extends Canine {


    public Dog(String name) {
        super(name);
    }

    String makeSound() {
        return "woof";
    }

    String eat() {
        return "cats";
    }
}
