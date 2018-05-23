package service;

import model.User;

import java.util.List;

/**
 * Created by Баранов on 23.05.2018.
 */
public interface UserController {

    public void addUser(User user);

    public void updateUser(User user);

    public void removeUser(int id);

    public User getByUserId(int id);

    public List<User> listUsers();


}
