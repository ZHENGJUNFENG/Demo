package com.example.demo.service.impl;

import com.example.demo.dto.UploadDataDto;
import com.example.demo.service.ApiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ApiServiceImpl implements ApiService {

    private static final Logger logger = LoggerFactory.getLogger("uploadData");

    @Override
    public String uploadData(UploadDataDto uploadDataDto) {
        logger.info(uploadDataDto.getMsg());
        return "success";
    }
}
