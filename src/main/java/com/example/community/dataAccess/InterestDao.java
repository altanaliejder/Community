package com.example.community.dataAccess;

import com.example.community.entities.Interest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterestDao extends JpaRepository<Interest,Integer> {
}
