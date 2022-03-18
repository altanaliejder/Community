package com.example.community.business.concretes;

import com.example.community.business.abstracts.CategoryService;
import com.example.community.business.dtos.CategoryListDto;
import com.example.community.business.request.category.CreateCategoryRequest;
import com.example.community.core.business.BusinessRule;
import com.example.community.core.mapping.ModelMapperService;
import com.example.community.core.results.*;
import com.example.community.dataAccess.CategoryDao;
import com.example.community.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryManager implements CategoryService {
    private CategoryDao categoryDao;
    private ModelMapperService modelMapperService;

    @Autowired
    public CategoryManager(CategoryDao categoryDao, ModelMapperService modelMapperService) {
        this.categoryDao = categoryDao;
        this.modelMapperService = modelMapperService;
    }

    @Override
    public DataResult<List<CategoryListDto>> getAllCategory() {
        var categoryList= this.categoryDao.findAll();
        var response= categoryList.stream().map(category -> modelMapperService.forDto().map(category,CategoryListDto.class)).collect(Collectors.toList());
        return new SuccessDataResult<List<CategoryListDto>>(response);
    }

    @Override
    public Result add(CreateCategoryRequest createCategoryRequest) {
        var response= BusinessRule.run(checkIfCategoryExist(createCategoryRequest.getName()));
        if(response==null){
            var category=this.modelMapperService.forRequest().map(createCategoryRequest, Category.class);
            this.categoryDao.save(category);
            return new SuccessResult("Eklendi");
        }
        return new ErrorResult(response.getMessage());
    }

    private Result checkIfCategoryExist(String categoryName){
        var category=this.categoryDao.getCategoryByName(categoryName);
        if(category==null){
            return new SuccessResult();
        }return new ErrorResult("Kategori zaten var");
    }
}
