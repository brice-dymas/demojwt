package com.jwt.repositories;

import com.jwt.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Projet:  demojwt
 * Cree par: Brice dymas
 * Date Creation: 2021, Tuesday 05 of January
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
