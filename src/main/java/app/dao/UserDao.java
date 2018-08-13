package app.dao;

import app.model.User;

import java.util.List;

/**
 * Created by Баранов on 23.05.2018.
 */
public interface UserDao {
    public void addUser(User user);

    public void updateUser(User user);

    public void removeUser(int id);

    public User getUserById(int id);

    public List<User> listUsers();


}
