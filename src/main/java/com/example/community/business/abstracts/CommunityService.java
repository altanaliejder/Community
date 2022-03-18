package com.example.community.business.abstracts;


import com.example.community.business.dtos.CommunityListDto;
import com.example.community.business.request.community.CreateCommunityRequest;
import com.example.community.core.results.DataResult;
import com.example.community.core.results.Result;

import java.util.List;

public interface CommunityService {

    DataResult<List<CommunityListDto>> getAllCommunity();
    Result add(CreateCommunityRequest createCommunityRequest);
}
