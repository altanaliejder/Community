package com.example.community.dataAccess;

import com.example.community.entities.UserCommunity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCommunityDao extends JpaRepository<UserCommunity,Integer> {
}
