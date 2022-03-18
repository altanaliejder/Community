package com.example.community.business.request.roleUser;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateRoleUserRequest {
    private int id;
    private int roleId;
    private int userId;
}
