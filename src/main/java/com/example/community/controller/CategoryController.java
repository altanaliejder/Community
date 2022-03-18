package com.example.community.controller;

import com.example.community.business.abstracts.CategoryService;
import com.example.community.business.dtos.CategoryListDto;
import com.example.community.business.request.category.CreateCategoryRequest;
import com.example.community.core.results.DataResult;
import com.example.community.core.results.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    private CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("getCategories")
    public DataResult<List<CategoryListDto>> getAllCategories(){
        return this.categoryService.getAllCategory();
    }

    @PostMapping("addCategory")
    public Result addCategory(@RequestBody CreateCategoryRequest createCategoryRequest){
        return this.categoryService.add(createCategoryRequest);
    }
}
