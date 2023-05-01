package com.example.toplandapp.requests;


import lombok.Data;

import javax.persistence.Column;

@Data
public class CommuntiyUpdateRequest {

    @Column(columnDefinition = "text")
    String description;

    String name;

    String location;
}
