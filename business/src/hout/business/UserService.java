package hout.business;

import entities.User;

import java.util.List;

public interface UserService {

    public void addNewUser(User user);

    public void removeUser(User user);

    public void removeUserById(long userId);

    public User getUserForId(Long id);

    public List<User> getAllUsers();
}
