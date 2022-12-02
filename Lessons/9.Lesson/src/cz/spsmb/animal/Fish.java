package cz.spsmb.animal;

public class Fish extends Animal {
    private boolean canSwim;

    public Fish(int age, String name, AnimalType type, boolean canSwim) {
        super(age, name, type);
        this.canSwim = canSwim;
    }

    @Override
    public void makeSound() {
        System.out.println("Blob");
    }

    @Override
    public String toString() {
        return "Fish{" +
                "type=" + type +
                ", canSwim=" + canSwim +
                '}';
    }
}
