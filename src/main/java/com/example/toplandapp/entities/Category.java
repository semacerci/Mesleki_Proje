package com.example.toplandapp.entities;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "category")
@Data

public class Category {
    @Id
    Long id;

    String name;


    @ManyToOne
    @JoinColumn(name = "community_id", nullable = false)
    Community community;


}
