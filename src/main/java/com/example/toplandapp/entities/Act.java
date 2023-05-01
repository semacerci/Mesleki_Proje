package com.example.toplandapp.entities;


import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "act")
@Data
public class Act {
    @Id
    Long id;


    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    User user;


    @ManyToOne
    @JoinColumn(name = "community_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    Community community;



    String name;

    String title;
    String date;
    String location;

    @Column(columnDefinition = "text")
    String description;
}
