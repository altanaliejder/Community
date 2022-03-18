package com.example.community.business.abstracts;

import com.example.community.business.dtos.PostListDto;
import com.example.community.business.request.post.CreatePostRequest;
import com.example.community.core.results.DataResult;
import com.example.community.core.results.Result;

import java.util.List;

public interface PostService {
    DataResult<List<PostListDto>> getAllPost();
    Result add(CreatePostRequest createPostRequest);
}
