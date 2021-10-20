package com.yourecipe.user.service;

import com.yourecipe.user.domain.User;

public interface UserService {
    boolean join(User user);
    User findUser(int userId);
    boolean editUser(User user);
    boolean
    removeUser(int userId);
}
