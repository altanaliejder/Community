package com.example.community.business.request.community;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCommunityRequest {
    private int id;
    private String name;
    private int categoryId;
}
