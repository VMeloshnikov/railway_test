package com.example.demo.rest.repo;

import com.example.demo.rest.dao.UserDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepo  extends JpaRepository<UserDAO,Long> {

    @Override
    Optional<UserDAO> findById(Long id);

    List<UserDAO> findAll();
}

