package com.asymmetry.test;

public class Student {
    private int id;
    private String name;
    private int age;
    private double score;

    /**
     * @param id    学号
     * @param name  姓名
     * @param age   年龄
     * @param score 成绩
     */
    public Student(int id, String name, int age, double score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student(1001, "张三", 20, 78);
        students[1] = new Student(1002, "李四", 23, 100);
        students[2] = new Student(1003, "王五", 25, 93);
        for (Student item : students) {
            System.out.println(item);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

}
