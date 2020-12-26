package com.flower.dao.impl;

import com.flower.dao.SignDao;
import com.flower.entity.User;
import com.flower.utiils.BaseDao;

import java.sql.*;
import java.util.ArrayList;

public class SignImpl extends BaseDao implements SignDao {
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    @Override
    public void signIn(User user) {
        String sql = "INSERT INTO flower_shop.users (user_id,user_name,user_pwd,user_sex,user_birth ,user_tel ,user_type) VALUES (?,?,?,?,?,?,?);";
        Object[] userMsg = {
                user.getUser_id(),
                user.getUser_name(),
                user.getUser_pwd(),
                user.getUser_sex(),
                Date.valueOf(user.getUser_birth()),
                user.getUser_tel(),
                user.getUser_type()
        };
        operation(sql, userMsg);
    }

    @Override
    public User signUp(String id, String password) {
        String sql = "select * from users where user_id=? and user_pwd=?";
        User user = new User();
        Connection connection = onConnection();
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, id);
            preparedStatement.setString(2, password);
            resultSet = preparedStatement.executeQuery();
            System.out.println(resultSet);
            if (resultSet.next()) {
                user.setUser_id(resultSet.getString("user_id"));
                user.setUser_name(resultSet.getString("user_name"));
                user.setUser_pwd(resultSet.getString("user_pwd"));
                user.setUser_birth(String.valueOf(resultSet.getDate("user_birth")));
                user.setUser_sex(resultSet.getString("user_sex"));
                user.setUser_tel(resultSet.getString("user_tel"));
                user.setUser_type(resultSet.getInt("user_type"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            this.offConnection(connection, preparedStatement, resultSet);
        }
        return user;
    }

    @Override
    public boolean updateMsg(User user) {
        String sql = "UPDATE flower_shop.users SET user_name=?,user_pwd=?,user_sex=?,user_birth=? ,user_tel=? WHERE user_id=?;";
        Object[] userMsg = {
                user.getUser_name(),
                user.getUser_pwd(),
                user.getUser_sex(),
                Date.valueOf(user.getUser_birth()),
                user.getUser_tel(),
                user.getUser_id()
        };
        return operation(sql, userMsg);
    }

    @Override
    public boolean deleteUser(String id) {
        String sql = "DELETE FROM flower_shop.users WHERE user_id=?;";
        Object[] userMsg = {id};
        return operation(sql, userMsg);
    }

    @Override
    public ArrayList<User> viewUsersMsg() {
        String sql = "select * from users;";
        ArrayList<User> userList = new ArrayList<>();
        Connection connection = onConnection();
        try {
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                User user = new User();
                user.setUser_id(resultSet.getString("user_id"));
                user.setUser_name(resultSet.getString("user_name"));
                user.setUser_pwd(resultSet.getString("user_pwd"));
                user.setUser_birth(String.valueOf(resultSet.getDate("user_birth")));
                user.setUser_sex(resultSet.getString("user_sex"));
                user.setUser_tel(resultSet.getString("user_tel"));
                user.setUser_type(resultSet.getInt("user_type"));
                userList.add(user);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            this.offConnection(connection, preparedStatement, resultSet);
        }
        return userList;
    }

}
