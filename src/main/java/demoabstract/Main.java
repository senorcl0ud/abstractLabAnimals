package demoabstract;

public class Main {
    public static void main(String[] args) {
        Canine dogOne = new Dog("Fido");
        Canine wolfOne = new Wolf("Balto");
        Canine dingoOne = new Dingo("Ripper");
        Feline pantherOne = new Panther("T'challa");
        Feline catOne = new Cat("Fluffy");
        Feline lynxOne = new Lynx("Lynx1");
        Birds pigeon = new Pigeon("pigeonONE");
        Birds falcon = new Falcon("FalconONE");
        Birds eagle = new Eagle("Baldy");

        Animal[] jungle = new Animal[]{dingoOne,wolfOne,dogOne,pantherOne,catOne,pigeon,lynxOne,falcon,eagle};

        for(Animal creature : jungle){
            System.out.println( creature.eat() );

        }

    }
}
