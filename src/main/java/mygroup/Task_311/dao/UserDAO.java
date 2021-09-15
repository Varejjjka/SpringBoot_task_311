package mygroup.Task_311.dao;


import mygroup.Task_311.model.User;

import java.util.List;

public interface UserDAO {

    List<User> allUsers();

    void add(User user);

    void delete(User user);

    void edit(User user);

    User getById(long id);

    User findByUsername(String username);
}