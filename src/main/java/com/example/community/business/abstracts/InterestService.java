package com.example.community.business.abstracts;

import com.example.community.business.dtos.InterestListDto;
import com.example.community.business.request.interest.CreateInterestRequest;
import com.example.community.core.results.DataResult;
import com.example.community.core.results.Result;

import java.util.List;

public interface InterestService {
    DataResult<List<InterestListDto>> getAllInterest();
    Result add(CreateInterestRequest createInterestRequest);
}
