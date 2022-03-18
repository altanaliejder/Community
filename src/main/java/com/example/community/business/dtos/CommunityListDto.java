package com.example.community.business.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommunityListDto {
    private int id;
    private String name;
    private String categoryName;
}
