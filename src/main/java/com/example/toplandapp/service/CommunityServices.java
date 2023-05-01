package com.example.toplandapp.service;

import com.example.toplandapp.entities.Community;
import com.example.toplandapp.entities.User;
import com.example.toplandapp.repos.CommunityRepository;
import com.example.toplandapp.requests.CommunityCreateRequest;
import com.example.toplandapp.requests.CommuntiyUpdateRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommunityServices {

    private CommunityRepository communityRepository;
    private UserServices userServices;

    public CommunityServices(CommunityRepository communityRepository, UserServices userServices) {
        this.communityRepository = communityRepository;
        this.userServices = userServices;
    }

    public List<Community> getAllCommunity() {
        return communityRepository.findAll();
    }


    public Community getOneCommunity(Long communityId) {
        return communityRepository.findById(communityId).orElse(null);
    }


    public Community updateOneCommunity(Long communityId, CommuntiyUpdateRequest updateCommunity) {
        Optional<Community> community = communityRepository.findById(communityId);
        if (community.isPresent()) {
            Community toUpdate = community.get();
            toUpdate.setName(updateCommunity.getName());
            toUpdate.setDescription(updateCommunity.getDescription());
            toUpdate.setLocation(updateCommunity.getLocation());

            communityRepository.save(toUpdate);
            return toUpdate;
        } else
            return null;
    }

    public void deleteOneCommunity(Long communityId) {
        communityRepository.deleteById(communityId);
    }

    public Community createOneCommunity(CommunityCreateRequest newCommunityRequest) {
        User user = userServices.getOneuser(newCommunityRequest.getUserId());
        if (user == null)
            return null;
        Community toSave = new Community();
        toSave.setId(newCommunityRequest.getId());
        toSave.setName(newCommunityRequest.getName());
        toSave.setDescription(newCommunityRequest.getDesc());
        toSave.setUser(user);
        return communityRepository.save(toSave);
    }
}
