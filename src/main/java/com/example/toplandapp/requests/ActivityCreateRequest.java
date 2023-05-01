package com.example.toplandapp.requests;

import lombok.Data;

import javax.persistence.Column;

@Data
public class ActivityCreateRequest {

    Long id;
    Long userId;
    Long communityId;


    String name;

    String title;
    String date;
    String location;

    @Column(columnDefinition = "text")
    String description;
}
