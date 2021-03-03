package com.toyimageresizer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

@RestController
public class FileController {

    private static final Logger logger = LoggerFactory.getLogger(FileController.class);


    @PostMapping("/upload")
    public void uploadFile(@RequestParam("file") MultipartFile file) {

    }

    @GetMapping("/download/{fileName:.+}")
    public void downloadFile(@PathVariable String fileName, HttpServletRequest request) {
        
    }
}
