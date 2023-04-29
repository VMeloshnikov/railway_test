package com.example.demo.rest.services;

import com.example.demo.rest.dao.UserCardsDAO;
import com.example.demo.rest.dao.UserDAO;
import com.example.demo.rest.repo.UserCardRepo;
import com.example.demo.rest.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class DefaultService {


    private final UserRepo userRepo;

    private final UserCardRepo userCardRepo;

    public DefaultService(UserRepo userRepo, UserCardRepo userCardRepo) {
        this.userRepo = userRepo;
        this.userCardRepo = userCardRepo;
    }

    public ResponseEntity<?> getUser(Long id) {
        return ResponseEntity.of(userRepo.findById(id));

    }

    public ResponseEntity<?> getUsers() {
        return ResponseEntity.ok(userRepo.findAll());

    }
}
