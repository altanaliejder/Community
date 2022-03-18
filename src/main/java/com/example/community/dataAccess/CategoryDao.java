package com.example.community.dataAccess;

import com.example.community.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category,Integer > {
}
