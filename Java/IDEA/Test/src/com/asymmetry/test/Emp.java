package com.asymmetry.test;

public abstract class Emp {
    public String id;
    public String name;
    public String salary;

    /**
     * @param id     工号
     * @param name   姓名
     * @param salary 工资
     */
    Emp(String id, String name, String salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public abstract void work();
}
