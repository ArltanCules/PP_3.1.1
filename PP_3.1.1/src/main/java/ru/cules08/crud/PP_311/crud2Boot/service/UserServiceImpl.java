package ru.cules08.crud.PP_311.crud2Boot.service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.cules08.crud.PP_311.crud2Boot.dao.UserDao;
import ru.cules08.crud.PP_311.crud2Boot.models.User;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;


    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    @Transactional
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public User findById(long id) {
        return userDao.findById(id);
    }

    @Override
    @Transactional
    public void update( long id,User user) {
        userDao.update(user);
    }

    @Override
    @Transactional
    public void delete(long id) {
        userDao.delete(id);
    }

}
