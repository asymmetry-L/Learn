package com.flower.dao;

import com.flower.entity.User;

import java.util.ArrayList;

public interface SignDao {
    void signIn(User user);

    User signUp(String id, String password);

    boolean updateMsg(User user);

    boolean deleteUser(String id);

    ArrayList<User> viewUsersMsg();
}
