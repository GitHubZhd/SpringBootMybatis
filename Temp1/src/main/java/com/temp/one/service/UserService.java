package com.temp.one.service;

import com.temp.one.model.User;

public interface UserService {

    boolean addUser(User user);
    User selectUser(int age);
}
