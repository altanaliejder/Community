package com.example.community.dataAccess;

import com.example.community.entities.RoleUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleUserDao extends JpaRepository<RoleUser,Integer> {
}
