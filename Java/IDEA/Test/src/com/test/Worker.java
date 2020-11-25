package com.test;

import java.util.ArrayList;

/**
 * 定义一个员工类，属性有姓名 name,年龄 age,工资 salary,方法有
 * public void work(){
 * System.out.println(name + “……work!”);
 * }
 * 创建一个List，在List中增加三个员工，基本信息如下：
 * 姓名                 年龄                工资
 * 张三                  30                  9000
 * 李四                  31                  12000
 * 王五                  28                  9000
 * a)在李四之前插入一个员工，信息为：（1分）
 * 姓名：赵六，年龄：26，工资3300
 * b)删除王五的信息。（1分）
 * c)利用for循环遍历，打印List中所有员工的信息。（1分）
 * d)利用迭代遍历，对List中所有的工人调用work方法。（1分）
 * e)为员工类添加equals方法。（1分）
 * f)将员工工资由高到低排序，如果工资相同，年龄从小到大排序。
 */
public class Worker {

    private final String name;
    private final int age;
    private final float salary;

    public Worker(String name, int age, float salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(new Worker("张三", 30, 9000));
        workers.add(new Worker("李四", 31, 12000));
        workers.add(new Worker("王五", 28, 9000));
        workers.add(2, new Worker("赵六", 26, 3300));
//        workers.remove();
    }

    public void work() {
        System.out.println(name + " work!");
    }

    public float getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
