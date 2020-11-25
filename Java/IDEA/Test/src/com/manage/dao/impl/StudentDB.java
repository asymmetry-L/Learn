package com.manage.dao.impl;

import com.manage.StudentDao;
import com.manage.dao.DaoRule;
import com.manage.entity.Student;

import java.util.ArrayList;

public class StudentDB extends StudentDao implements DaoRule {
    @Override
    public boolean addStudentMessage(Student stu) {
        return false;
    }

    @Override
    public boolean deleteStudentManage(int stuId) {
        return false;
    }

    @Override
    public boolean updateStudentMessage(Student stu) {
        return false;
    }

    @Override
    public ArrayList<Student> selectStudentManage(int stuId) {
        return null;
    }
}
