package com.jwt.services.impl;

import com.jwt.domain.User;
import com.jwt.repositories.UserRepository;
import com.jwt.services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Projet:  demojwt
 * Cree par: Brice dymas
 * Date Creation: 2021, Tuesday 05 of January
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public User findByUsername(String username) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<User> findAll() {
        return null;
    }
}
