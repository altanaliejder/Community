package com.example.community.business.request.post;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdatePostRequest {
    private int id;
    private String text;
    private LocalDate creationDate;
    private int userId;
}
