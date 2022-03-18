package com.example.community.dataAccess;

import com.example.community.entities.Community;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommunityDao extends JpaRepository<Community,Integer> {
}
