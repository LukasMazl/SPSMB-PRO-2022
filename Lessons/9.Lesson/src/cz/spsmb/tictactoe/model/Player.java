package cz.spsmb.tictactoe.model;

public class Player {
    private String name;
    private char mark;
    private int salary;

    public Player(String name, char mark, int salary) {
        this.name = name;
        this.mark = mark;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getMark() {
        return mark;
    }

    public void setMark(char mark) {
        this.mark = mark;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", mark=" + mark +
                ", salary=" + salary +
                '}';
    }
}
