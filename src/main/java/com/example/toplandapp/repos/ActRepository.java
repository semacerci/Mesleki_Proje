package com.example.toplandapp.repos;


import com.example.toplandapp.entities.Act;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActRepository extends JpaRepository<Act,Long> {


    List<Act> findByUserıdAndCommunityId(Long userId, Long communityId);

    List<Act> findByUserId(Long userId);

    List<Act> findByCommunityId(Long communityId);
}
