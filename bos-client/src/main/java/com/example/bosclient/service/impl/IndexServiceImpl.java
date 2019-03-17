package com.example.bosclient.service.impl;

import com.example.bosclient.service.IndexService;
import org.springframework.stereotype.Service;

@Service
public class IndexServiceImpl implements IndexService {
    @Override
    public String getIndex() {

        return "client";
    }
}
