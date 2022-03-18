package com.example.community.dataAccess;

import com.example.community.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostDao extends JpaRepository<Post,Integer> {
}
