package com.practiceRestAPI.UserRestAPI.services;

import com.practiceRestAPI.UserRestAPI.entities.User;
import com.practiceRestAPI.UserRestAPI.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUsers() {
        List<User> users = userRepository.findAll();
        return users;
    }

    @Override
    public User getUser(long id) {
        Optional<User> user = userRepository.findById(id);
        return user.get();
    }

    @Override
    public User addUser(User user) {
        userRepository.save(user);
        return user;
    }

    @Override
    public User updateUser(User user) {
        userRepository.save(user);
        return user;
    }

    @Override
    public void deleteUser(long id) {
        User user = userRepository.findAll().stream().filter(u -> u.getId()==id).collect(Collectors.toList()).get(0);
        userRepository.delete(user);
    }
}
