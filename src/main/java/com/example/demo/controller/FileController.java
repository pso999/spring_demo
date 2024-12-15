package com.example.demo.controller;

import com.example.demo.dto.file.UploadFileArgsDTO;
import com.example.demo.handle.FileHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/file")
public class FileController {

    @Autowired
    private FileHandle fileHandle;

    @PostMapping("/upload-file")
    public com.example.demo.common.CommonResult<Object> uploadFile(UploadFileArgsDTO args) throws Exception {
        fileHandle.saveComment(args);
        return com.example.demo.common.CommonResult.ok(null);
    }
}
