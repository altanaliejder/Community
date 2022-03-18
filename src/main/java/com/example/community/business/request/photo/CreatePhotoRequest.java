package com.example.community.business.request.photo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatePhotoRequest {
    private String url;
    private int postId;
}
