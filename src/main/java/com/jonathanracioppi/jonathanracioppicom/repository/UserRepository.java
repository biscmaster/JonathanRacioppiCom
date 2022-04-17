package com.jonathanracioppi.jonathanracioppicom.repository;

import com.jonathanracioppi.jonathanracioppicom.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User, Long> {

    User getUserByUsername(String username);

}
