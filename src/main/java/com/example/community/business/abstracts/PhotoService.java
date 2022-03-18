package com.example.community.business.abstracts;

import com.example.community.business.dtos.PhotoListDto;
import com.example.community.business.request.photo.CreatePhotoRequest;
import com.example.community.core.results.DataResult;
import com.example.community.core.results.Result;

import java.util.List;

public interface PhotoService {
    DataResult<List<PhotoListDto>> getAllPhoto();
    Result add(CreatePhotoRequest createPhotoRequest);
}
