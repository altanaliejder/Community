package com.example.community.business.abstracts;

import com.example.community.business.dtos.RoleUserListDto;
import com.example.community.business.request.roleUser.CreateRoleUserRequest;
import com.example.community.core.results.DataResult;
import com.example.community.core.results.Result;

import java.util.List;

public interface RoleUserService {
    DataResult<List<RoleUserListDto>> getAllRoleUser();
    Result add(CreateRoleUserRequest createRoleUserRequest);
}
