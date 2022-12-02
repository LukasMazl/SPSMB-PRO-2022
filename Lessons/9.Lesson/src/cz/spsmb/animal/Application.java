package cz.spsmb.animal;

import cz.spsmb.animal.Animal;
import cz.spsmb.animal.AnimalType;
import cz.spsmb.animal.Dog;
import cz.spsmb.animal.Fish;

public class Application {

    public static void main(String[] args) {
        Animal fido = new Dog(3);
        Animal nano = new Fish(1, "Nano", AnimalType.FISH, true);

        fido.makeSound();
        nano.makeSound();

        System.out.println(fido);
        System.out.println(nano);

    }
}
