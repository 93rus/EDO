package service;

import dao.UserDao;
import model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Баранов on 23.05.2018.
 */
@Service
public class UserControllerImpl implements UserController {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public void addUser(User user) {
        this.userDao.addUser(user);

    }

    @Override
    @Transactional
    public void updateUser(User user) {
        this.userDao.updateUser(user);

    }

    @Override
    @Transactional
    public void removeUser(int id) {
        this.userDao.removeUser(id);

    }

    @Override
    public User getByUserId(int id) {
        return this.userDao.getUserById(id);
    }

    @Override
    public List<User> listUsers() {
        return this.userDao.listUsers();
    }
}
