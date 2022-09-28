package ru.cules08.crud.PP_311.crud2Boot.dao;


import ru.cules08.crud.PP_311.crud2Boot.models.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    void save(User user);
    User findById(long id);
    void update( User user);
    void delete(long id);
}


