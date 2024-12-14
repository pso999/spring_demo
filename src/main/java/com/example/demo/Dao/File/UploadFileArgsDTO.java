package com.example.demo.Dao.File;

import lombok.Builder;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
@Builder
public class UploadFileArgsDTO {
    private MultipartFile file;
    private String topicID;
    private String userID;
}
