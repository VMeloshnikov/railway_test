package com.example.demo.rest.dao;


import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "user", schema = "public")
public class UserDAO {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<UserCardsDAO> cards = new ArrayList<>();

    public void userCard(UserCardsDAO userCardsDAO){
        this.cards.add(userCardsDAO);
        userCardsDAO.setUser(this);
    }
    public void removeUserCard(UserCardsDAO userCardsDAO){
        this.cards.remove(userCardsDAO);
        userCardsDAO.setUser(null);
    }

}
