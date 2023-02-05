package com.practiceRestAPI.UserRestAPI.services;

import com.practiceRestAPI.UserRestAPI.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    public List<User> getUsers();
    public User getUser(long id);
    public User addUser(User user);
    public User updateUser(User user);
    public void deleteUser(long id);

}
