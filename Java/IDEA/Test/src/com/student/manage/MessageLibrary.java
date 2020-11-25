package com.student.manage;

import java.util.ArrayList;

public class MessageLibrary {
    private static ArrayList<ArrayList> studentList = new ArrayList();
    /**
     * |学号|姓名|年龄|性别|
     */
//    private String stuId;
//    private String stuName;
//    private int stuAge;
//    private char stuSex;
    private ArrayList studentMag;

    public MessageLibrary() {
    }

    /**
     * @param stuId
     * @param stuName
     * @param stuAge
     * @param stuSex
     */
    public MessageLibrary(String stuId, String stuName, int stuAge, char stuSex) {
        studentMag = new ArrayList() {{
            add(stuId);
            add(stuName);
            add(stuAge);
            add(stuSex);
        }};
        studentList.add(studentMag);
    }

    @Override
    public String toString() {
        String str = "";
        for (ArrayList message : studentList) {
            str += message + ",\n";
        }
        return str;
    }

    public ArrayList<ArrayList> getStudentList() {
        return studentList;
    }

    public static void setStudentList(ArrayList<ArrayList> studentList) {
        MessageLibrary.studentList = studentList;
    }
}
