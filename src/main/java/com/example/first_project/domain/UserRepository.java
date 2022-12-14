package com.example.first_project.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<Users,Long> {
    Optional<Users> findByUsername(String username);
}
