package ru.cules08.crud.PP_311.crud2Boot.service;


import ru.cules08.crud.PP_311.crud2Boot.models.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void save(User user);
    User findById(long id);
    void update(long id,User user);
    void delete(long id);
}
