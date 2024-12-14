package com.example.demo.dto.file;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UploadFileDataDTO {
    @ExcelProperty("评论")
    private String content;
}
