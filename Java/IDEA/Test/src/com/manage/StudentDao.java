package com.manage;

import java.sql.*;

public class StudentDao {
    private final static String MYSQL_DRIVER = "com.mysql.jdbc.Driver";
    private final static String MYSQL_URL = "jdbc:mysql://localhost:3306/studytest?useSSL=false";
    private final static String MYSQL_USER = "root";
    private final static String MYSQL_PASSWORD = "root";

    private Connection connection = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    /**
     * 创建数据库链接
     *
     * @return
     */
    public Connection createLink() {
        try {
            Class.forName(MYSQL_DRIVER);
            connection = DriverManager.getConnection(MYSQL_URL, MYSQL_USER, MYSQL_PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    /**
     * 断开数据库链接
     */
    public void breakLink() {
        try {
            if (connection != null) connection.close();
            if (preparedStatement != null) preparedStatement.close();
            if (resultSet != null) resultSet.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
