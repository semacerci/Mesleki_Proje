package com.example.toplandapp.controllers;



import com.example.toplandapp.entities.Act;
import com.example.toplandapp.entities.Community;
import com.example.toplandapp.requests.ActivityCreateRequest;
import com.example.toplandapp.requests.ActivityUpdateRequest;
import com.example.toplandapp.service.ActServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/activity")
public class ActController {


    private  ActServices actServices;

    public ActController(ActServices actServices) {
        this.actServices = actServices;
    }

    @GetMapping
    public List<Act> getAllActivity(@RequestParam Optional<Long> userId,@RequestParam Optional<Long> communityId ) {
        return actServices.getAllActivityWithParam(userId,communityId);
    }

    @GetMapping("/{activityId}")
    public Act getOneActivity(@PathVariable Long activityId) {
        return actServices.getOneActivity(activityId);
    }

    @PostMapping
    public Act createOneActivity(@RequestBody ActivityCreateRequest request ) {
        return actServices.createOneActivity(request);
    }

    @PutMapping("/{activityId}")
    public Act updateOneActivity(@PathVariable Long activityId, @RequestBody ActivityUpdateRequest request) {
        return actServices.updateOneActivity(activityId, request);
    }


    @DeleteMapping("/{activityId}")
    public void deleteOneActivity(@PathVariable Long activityId) {
        actServices.deleteOneActivity(activityId);
    }






}
