package com.student.manage;

import java.util.ArrayList;

public class MessageOperate {
    MessageLibrary library;

    public MessageOperate() {
        library = new MessageLibrary();
    }

    /**
     * 增加学生信息
     *
     * @param stuId   学号
     * @param stuName 姓名
     * @param stuAge  年龄
     * @param stuSex  性别
     */
    public void addMessage(String stuId, String stuName, int stuAge, char stuSex) {
        new MessageLibrary(stuId, stuName, stuAge, stuSex);
    }

    /**
     * 删除学生信息
     *
     * @param stuId 学号
     * @return 删除成功返回true
     */
    public boolean dropMessage(String stuId) {
        ArrayList<ArrayList> message = this.library.getStudentList();
        for (ArrayList stuMsg : message) {
            if (stuMsg.get(0).equals(stuId)) {
                message.remove(stuMsg);
                return true;
            }
        }
        return false;
    }

    /**
     * 通过学号精确查找
     *
     * @param stuId 学号
     * @return 返回查找到的学生信息
     */
    public String selectMessage(String stuId) {
        String Message = "";
        ArrayList<ArrayList> message = this.library.getStudentList();
        for (ArrayList stuMsg : message) {
            if (stuMsg.get(0).equals(stuId)) {
                Message += stuMsg;
            }
        }
        return Message;
    }

    /**
     * 通过年龄查找
     *
     * @param age 年龄
     * @return 返回查找到的信息
     */
    public String selectMessage(int age) {
        String Message = "";
        ArrayList<ArrayList> message = this.library.getStudentList();
        for (ArrayList stuMsg : message) {
            if ((int) stuMsg.get(2) == age) {
                Message += stuMsg;
            }
        }
        return Message;
    }

    /**
     * 通过单个字符模糊查找
     *
     * @param word 查询词
     * @return 返回查找到的数据
     */
    public String selectMessage(char word) {
        String symbol = String.valueOf(word);
        String message = "";
        if (symbol.equals("*")) {
            message = library.toString();
        } else {
            ArrayList<ArrayList> messageObj = this.library.getStudentList();
            for (ArrayList stuMsg : messageObj) {
                String msg = String.valueOf(stuMsg);
                if (msg.contains(symbol)) {
                    message += msg + "\n";
                }
            }
        }
        if (message.length() > 0) {
            return message;
        } else {
            return null;
        }
    }

    /**
     * 对年龄排序
     * @param flag 1为升序，-1为降序
     * @return 返回排序结果
     */
//    public String rankAge(int flag) {
//        String Message = "";
//        ArrayList<ArrayList> message = this.library.getStudentList();
//        for (ArrayList stuMsg : message) {
//            if ((int)stuMsg.get(2) == age) {
//                Message += stuMsg;
//            }
//        }
//        return Message;
//    }

}
