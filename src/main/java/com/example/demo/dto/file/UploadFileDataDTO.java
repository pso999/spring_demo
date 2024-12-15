package com.example.demo.dto.file;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UploadFileDataDTO {
    @ExcelProperty(value = "评论",index = 0)
    private String content;
}
