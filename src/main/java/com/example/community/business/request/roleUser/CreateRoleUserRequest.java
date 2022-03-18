package com.example.community.business.request.roleUser;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateRoleUserRequest {
    private int roleId;
    private int userId;
}
