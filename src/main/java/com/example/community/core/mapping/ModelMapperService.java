package com.example.community.core.mapping;

import org.modelmapper.ModelMapper;

public interface ModelMapperService {
    ModelMapper forDto();
    ModelMapper forRequest();
}