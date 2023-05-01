package com.example.toplandapp.service;

import com.example.toplandapp.entities.Act;
import com.example.toplandapp.entities.Community;
import com.example.toplandapp.entities.User;
import com.example.toplandapp.repos.ActRepository;

import com.example.toplandapp.requests.ActivityCreateRequest;
import com.example.toplandapp.requests.ActivityUpdateRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActServices {

    ActRepository actRepository;
    UserServices userServices;
    CommunityServices communityServices;

    public ActServices(ActRepository actRepository, UserServices userServices, CommunityServices communityServices) {
        this.actRepository = actRepository;
        this.userServices = userServices;
        this.communityServices = communityServices;
    }


    public List<Act> getAllActivity() {
        return actRepository.findAll();
    }

    public Act getOneActivity(Long activityId) {
        return actRepository.findById(activityId).orElse(null);
    }


    public Act saveOneActivity(Act newActivity) {
        return actRepository.save(newActivity);
    }

    public Act updateOneActivity(Long activityId, ActivityUpdateRequest request) {
        Optional<Act> activity = actRepository.findById(activityId);

        if (activity.isPresent()) {
            Act activityToUpdate = activity.get();
            activityToUpdate.setName(request.getName());
            activityToUpdate.setTitle(request.getTitle());
            activityToUpdate.setDescription(request.getDescription());
            activityToUpdate.setDate(request.getDate());
            activityToUpdate.setLocation(request.getLocation());

          return  actRepository.save(activityToUpdate);
        } else
            return null;
    }

    public void deleteOneActivity(Long activityId) {
        actRepository.deleteById(activityId);
    }

    public List<Act> getAllActivityWithParam(Optional<Long> userId, Optional<Long> communityId) {

        if (userId.isPresent() && communityId.isPresent()) {
            return actRepository.findByUserıdAndCommunityId(userId.get(), communityId.get());
        } else if (userId.isPresent()) {
            return actRepository.findByUserId(userId.get());
        } else if (communityId.isPresent()) {
            return actRepository.findByCommunityId(communityId.get());
        } else {
            return actRepository.findAll();
        }
    }

    public Act createOneActivity(ActivityCreateRequest request) {

        User user = userServices.getOneuser(request.getUserId());
        Community community = communityServices.getOneCommunity(request.getCommunityId());

        if (user != null && community != null) {
            Act activityToSave = new Act();
            activityToSave.setId(request.getId());
            activityToSave.setUser(user);
            activityToSave.setCommunity(community);
            activityToSave.setName(request.getName());
            activityToSave.setTitle(request.getTitle());
            activityToSave.setLocation(request.getLocation());
            activityToSave.setDescription(request.getDescription());
            activityToSave.setDate(request.getDate());

            return actRepository.save(activityToSave);
        }else
        return null;
    }
}
