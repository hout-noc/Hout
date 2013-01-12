package hout.business.dao;

import entities.User;

import java.util.List;

public interface UserDao {

   public void removeUserById(long id);

    public void removeUser(User user);

    public List<User> getAllUsers();

    public User getUserById(long id);

    public void save(User user);
}
