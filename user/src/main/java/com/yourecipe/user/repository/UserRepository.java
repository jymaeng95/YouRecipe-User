package com.yourecipe.user.repository;

import com.yourecipe.user.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {
    //CRUD
    int createUser(User user);

    User getUser(int userId);

    int updateUser(User user);

    int deleteUser(int userId);
}
