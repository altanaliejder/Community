package com.example.community.business.request.userCommunity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserCommunityRequest {
    private int userId;
    private int communityId;
}
