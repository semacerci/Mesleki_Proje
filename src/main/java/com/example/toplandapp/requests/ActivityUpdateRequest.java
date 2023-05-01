package com.example.toplandapp.requests;

import lombok.Data;

import javax.persistence.Column;

@Data
public class ActivityUpdateRequest {

    String name;

    String title;
    String date;
    String location;

    @Column(columnDefinition = "text")
    String description;


}
