package com.asymmetry.test;

public class NameSalary {
    int jobNum;
    String name;
    private double salary;

    public NameSalary(int jobNum, String name, double salary) {
        this.jobNum = jobNum;
        this.name = name;
        this.salary = salary;
    }

    public static void main(String[] args) {
        NameSalary[] worker = new NameSalary[3];
        worker[0] = new NameSalary(1001, "张三", 20000);
        worker[1] = new NameSalary(1002, "李四", 10000);
        worker[2] = new NameSalary(1003, "王五", 5000);
        for (NameSalary item : worker) {

            if (item.searchSalary("李四")) return;
        }
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    boolean searchSalary(String name) {
        if (this.name.equals(name)) {
            System.out.println(this.getSalary());
            return true;
        }
        return false;
    }
}
