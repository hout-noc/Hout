package hout.business.impl;

import entities.User;
import hout.business.UserService;
import hout.business.dao.UserDao;

import java.util.List;

public class UserServiceImpl implements UserService{

    UserDao userDao;

    @Override
    public void addNewUser(User user) {
        userDao.save(user);
    }

    @Override
    public void removeUser(User user) {
        userDao.removeUser(user);
    }

    @Override
    public void removeUserById(long userId) {
        userDao.removeUserById(userId);
    }

    @Override
    public User getUserForId(Long id) {
        return userDao.getUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
}
