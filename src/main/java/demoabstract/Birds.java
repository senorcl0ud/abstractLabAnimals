package demoabstract;

public abstract class Birds extends Animal {
    public Birds(String name) {
        super(name);
    }

    String makeSound() {
        return null;
    }

    String eat() {
        return null;
    }
}
