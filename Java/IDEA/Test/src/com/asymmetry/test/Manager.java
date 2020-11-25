package com.asymmetry.test;

public class Manager extends Emp {
    Manager(String id, String name, String salary) {
        super(id, name, salary);
    }

    public static void main(String[] args) {
        Emp manager = new Manager("121212", "张三", "10K");
        manager.work();
        System.out.println(manager);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    @Override
    public void work() {
        System.out.println("管理。。。");
    }
}
