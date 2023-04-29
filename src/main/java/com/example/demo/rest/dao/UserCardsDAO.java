package com.example.demo.rest.dao;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "user_card", schema = "public")
public class UserCardsDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
//    @Column(name = "user_id", nullable = false)
//    private Long userId;
    @Column(name = "card_number", nullable = false)
    private String cardNumber;
    @Column(name = "card_sum", nullable = false)
    private String cardSum;
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private UserDAO user;

    public UserCardsDAO(String cardNumber, String cardSum) {
        this.cardNumber = cardNumber;
        this.cardSum = cardSum;
    }
}
