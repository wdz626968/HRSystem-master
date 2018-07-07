package com.kevin.HRSystem.dao;

import com.kevin.HRSystem.model.User;

public interface UserDao {
    User selectUser(long id);
}
