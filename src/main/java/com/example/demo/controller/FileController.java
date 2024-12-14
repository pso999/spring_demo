package com.example.demo.controller;

import com.alibaba.excel.EasyExcel;
import com.example.demo.Dao.File.UploadFileArgsDTO;
import com.example.demo.dto.file.UploadFileDataDTO;
import com.example.demo.handle.FileHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/file")
public class FileController {

    @Autowired
    private FileHandle fileHandle;

    @PostMapping("/upload-file")
    public com.example.demo.common.CommonResult.CommonResult<Object> uploadFile(UploadFileArgsDTO args) {
        fileHandle.saveComment(args);
        return com.example.demo.common.CommonResult.CommonResult.ok(null);
    }
}
