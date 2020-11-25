package com.asymmetry.test;

public class Programmer extends Emp {
    public String bonus;

    public Programmer(String id, String name, String salary, String bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    public static void main(String[] args) {
        Emp programmer = new Programmer("1313131", "张伟", "11K", "15K");
        System.out.println(programmer);
        programmer.work();
    }

    @Override
    public void work() {
        System.out.println("敲代码");
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "bonus='" + bonus + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
