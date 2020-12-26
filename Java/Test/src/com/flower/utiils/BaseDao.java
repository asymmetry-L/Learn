package com.flower.utiils;

import java.sql.*;

public class BaseDao {
    private static final String MYSQL_DRIVER = "com.mysql.jdbc.Driver";
    private static final String MYSQL_URL = "jdbc:mysql://localhost:3306/flower_shop?useSSL=false";
    private static final String MYSQL_USER = "root";
    private static final String MYSQL_PWD = "root";

    private Connection connection;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    public Connection onConnection() {
        try {
            Class.forName(MYSQL_DRIVER);
            connection = DriverManager.getConnection(MYSQL_URL, MYSQL_USER, MYSQL_PWD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public boolean operation(String sql, Object[] obj) {
        connection = onConnection();
        boolean flag = false;
        try {
            preparedStatement = connection.prepareStatement(sql);
            for (int i = 0; i < obj.length; i++) {
                preparedStatement.setObject(i+1, obj[i]);
            }
            flag = preparedStatement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            offConnection(connection, preparedStatement, resultSet);
        }
        return flag;
    }

    public void offConnection(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet) {
        try {
            if (connection != null) {
                connection.close();
            }
            if (resultSet != null) {
                resultSet.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
