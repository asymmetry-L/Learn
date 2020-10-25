package com.asymmetry.test;

public class Manager extends Emp {
    @Override
    public String toString() {
        return "Manager{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    Manager(String id, String name, String salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("管理。。。");
    }

    public static void main(String[] args) {
        Emp manager = new Manager("121212", "张三", "10K");
        manager.work();
        System.out.println(manager);
    }
}
