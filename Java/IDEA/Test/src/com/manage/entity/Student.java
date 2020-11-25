package com.manage.entity;

public class Student {
    /* stu_id|stu_name|stu_sex|stu_age|stu_department|*/
    private int stuId;
    private String stuName;
    private String stuSes;
    private int stuAge;
    private String stuDepartment;

    public Student(int stuId, String stuName, String stuSes, int stuAge, String stuDepartment) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuSes = stuSes;
        this.stuAge = stuAge;
        this.stuDepartment = stuDepartment;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuSes() {
        return stuSes;
    }

    public void setStuSes(String stuSes) {
        this.stuSes = stuSes;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuDepartment() {
        return stuDepartment;
    }

    public void setStuDepartment(String stuDepartment) {
        this.stuDepartment = stuDepartment;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", stuSes='" + stuSes + '\'' +
                ", stuAge=" + stuAge +
                ", stuDepartment='" + stuDepartment + '\'' +
                '}';
    }
}
