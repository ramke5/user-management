package ba.ramke.usermanagement.service;

import ba.ramke.usermanagement.model.User;

import java.util.List;

public interface UserService {

    public User saveUser(User user);
    public List<User> getAllUsers();
}
