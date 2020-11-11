package com.web.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Proto {

    @Autowired
    private Proto proto;

    public Proto getProto(){
        return proto;
    }
}
