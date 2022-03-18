package com.example.community.dataAccess;

import com.example.community.entities.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolDao extends JpaRepository<School,Integer> {
}
