package com.example.demo.controller;

import com.example.demo.dto.UploadDataDto;
import com.example.demo.service.ApiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    private static final Logger logger = LoggerFactory.getLogger(ApiController.class);

    @Autowired
    private ApiService apiService;

    @PostMapping("/uploadData")
    public String uploadData(@RequestBody UploadDataDto uploadDataDto){
        logger.info("data upload:{}",uploadDataDto.getMsg());
        return apiService.uploadData(uploadDataDto);
    }

    @GetMapping("/test")
    public String test(){
        return "Test";
    }
}
