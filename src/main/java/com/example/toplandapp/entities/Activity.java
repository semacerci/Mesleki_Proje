package com.example.toplandapp.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "activity")
@Data
public class Activity {
    @Id
    Long id;
    Long userId;
    Long communityId;
    @Lob
    @Column(columnDefinition = "text")
    String desc;
    String location;
    String date;

    String title;
    String name;


}
