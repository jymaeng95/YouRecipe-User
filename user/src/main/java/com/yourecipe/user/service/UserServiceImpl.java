package com.yourecipe.user.service;

import com.yourecipe.user.domain.User;
import com.yourecipe.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean join(User user) {
        return userRepository.createUser(user) > 0;
    }

    @Override
    public User findUser(int userId) {
        return userRepository.getUser(userId);
    }

    @Override
    public boolean editUser(User user) {
        return userRepository.updateUser(user) > 0;
    }

    @Override
    public boolean removeUser(int userId) {
        return userRepository.deleteUser(userId) > 0;
    }
}
