package com.example.toplandapp.requests;


import lombok.Data;

@Data
public class CommunityCreateRequest {

    Long id;

    Long userId;

    String name;
    String desc;
    String location;

}
