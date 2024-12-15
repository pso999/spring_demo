package com.example.demo.dto.file;

import lombok.Builder;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
@Builder
public class UploadFileArgsDTO {
    private MultipartFile file;
    private Integer topicID;
    private Integer userID;
}
