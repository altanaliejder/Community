package com.example.community.business.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostListDto {
    private int id;
    private String text;
    private LocalDate creationDate;
}
