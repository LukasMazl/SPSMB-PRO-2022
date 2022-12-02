package cz.spsmb.animal;

public class Dog extends Animal {
    private int numberOfFoot;

    public Dog(int numberOfFoot) {
        super(5, "Fidle", AnimalType.DOG);
        this.numberOfFoot = numberOfFoot;
    }

    public AnimalType getAnimalType() {
        return type;
    }

    @Override
    public void makeSound() {
        System.out.println("Haf");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "type=" + type +
                ", numberOfFoot=" + numberOfFoot +
                '}';
    }
}
