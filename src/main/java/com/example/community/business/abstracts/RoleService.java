package com.example.community.business.abstracts;

import com.example.community.business.dtos.RoleListDto;
import com.example.community.business.request.role.CreateRoleRequest;
import com.example.community.core.results.DataResult;
import com.example.community.core.results.Result;

import java.util.List;

public interface RoleService {
    DataResult<List<RoleListDto>> getAllRole();
    Result add(CreateRoleRequest createRoleRequest);
}
