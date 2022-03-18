package com.example.community.dataAccess;

import com.example.community.entities.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhotoDao extends JpaRepository<Photo,Integer> {
}
