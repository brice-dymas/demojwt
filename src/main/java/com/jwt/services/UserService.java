package com.jwt.services;

import com.jwt.domain.User;

import java.util.List;

/**
 * Projet:  demojwt
 * Cree par: Brice dymas
 * Date Creation: 2021, Tuesday 05 of January
 */
public interface UserService {
    User save(User user);
    User update(User user);
    User findById(Long id);
    User findByUsername(String username);
    void deleteById(Long id);
    List<User> findAll();
}
