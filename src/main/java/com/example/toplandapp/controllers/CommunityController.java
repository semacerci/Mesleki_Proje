package com.example.toplandapp.controllers;

import com.example.toplandapp.entities.Community;
import com.example.toplandapp.entities.User;
import com.example.toplandapp.repos.CommunityRepository;
import com.example.toplandapp.requests.CommunityCreateRequest;
import com.example.toplandapp.requests.CommuntiyUpdateRequest;
import com.example.toplandapp.service.CommunityServices;
import com.example.toplandapp.service.UserServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/community")
public class CommunityController {

    private CommunityServices communityServices;

    public CommunityController(CommunityServices communityServices) {
        this.communityServices = communityServices;
    }

    @GetMapping
    public List<Community> getAllCommunity() {
        return communityServices.getAllCommunity();
    }

    @GetMapping("/{communityId}")
    public Community getOneCommunity(@PathVariable Long communityId) {
        return communityServices.getOneCommunity(communityId);
    }

    @PostMapping
    public Community createOneCommunity(@RequestBody CommunityCreateRequest newCommunityRequest) {
        return communityServices.createOneCommunity(newCommunityRequest);
    }

    @PutMapping("/{communityId}")
    public Community updateOneCommunity(@PathVariable Long communityId, @RequestBody CommuntiyUpdateRequest updateCommunity) {
        return communityServices.updateOneCommunity(communityId, updateCommunity);
    }


    @DeleteMapping("/{communityId}")
    public void deleteOneCommunity(@PathVariable Long communityId) {
        communityServices.deleteOneCommunity(communityId);
    }

}
