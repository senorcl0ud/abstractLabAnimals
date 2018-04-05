package demoabstract;

public class Panther extends Feline {
    public Panther(String name) {
        super(name);
    } //PAHNTA

    String makeSound() {
        return "growl";
    }

    String eat() {
        return "panther food";
    }
}
