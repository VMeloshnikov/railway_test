package com.example.demo.rest.repo;

import com.example.demo.rest.dao.UserCardsDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCardRepo  extends JpaRepository<UserCardsDAO, Long> {
}
