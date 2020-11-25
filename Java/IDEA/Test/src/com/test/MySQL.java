package com.test;

import java.sql.*;

public class MySQL {
    private static final String MYSQL_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost/studytest";

    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        Connection connection;
        Statement statement;
        try {
            Class.forName(MYSQL_DRIVER);
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            statement = connection.createStatement();
            String sqlSelect = "select * from student";
            String sqlInsert = "insert into student values(12346,'王七','男',20,'大理寺')";
            String sqlUpdate = "Update student set stu_name='阿里巴巴' where stu_id=111102";
            statement.executeUpdate(sqlUpdate);
            ResultSet resultSet = statement.executeQuery(sqlSelect);
            System.out.println("学号\t" + "\t姓名" + "\t性别" + "\t年龄" + "\t系别");
            while (resultSet.next()){
                System.out.println(resultSet.getString("stu_id") + "\t" + resultSet.getString("stu_name") + "\t" + resultSet.getString("stu_sex") + "\t" + resultSet.getString("stu_age") + "\t" + resultSet.getString("stu_department"));
//                System.out.println("=====CUT LINE=====");
            }
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
