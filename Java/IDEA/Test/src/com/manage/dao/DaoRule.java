package com.manage.dao;

import com.manage.entity.Student;

import java.util.ArrayList;

public interface DaoRule {
    public boolean addStudentMessage(Student stu);
    public boolean deleteStudentManage(int stuId);
    public boolean updateStudentMessage(Student stu);
    public ArrayList<Student> selectStudentManage(int stuId);
}
