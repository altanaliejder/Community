package com.example.community.business.abstracts;

import com.example.community.business.dtos.CategoryListDto;
import com.example.community.business.request.category.CreateCategoryRequest;
import com.example.community.core.results.DataResult;
import com.example.community.core.results.Result;
import com.example.community.entities.Category;

public interface CategoryService {
    DataResult<CategoryListDto> getAllCategory();
    Result add(CreateCategoryRequest createCategoryRequest);
}
