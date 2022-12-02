package cz.spsmb.animal;

public class Animal {
    private int age;
    private String name;
    protected AnimalType type;

    public Animal(int age, String name, AnimalType type) {
        this.age = age;
        this.name = name;
        this.type = type;
    }

    public void makeSound() {
        System.out.println("----------");
    }

    //GETTER SETTER section
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AnimalType getType() {
        return type;
    }

    public void setType(AnimalType type) {
        this.type = type;
    }
}
