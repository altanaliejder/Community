package com.example.community.core.business;

import com.example.community.core.results.Result;

public class BusinessRule {
    public static Result run(Result ...logics){
        for (Result logic:logics){
            if(!logic.isSuccess()){
                return logic;
            }
        }return null;
    }
}
