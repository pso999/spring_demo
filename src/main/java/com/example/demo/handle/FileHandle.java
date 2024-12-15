package com.example.demo.handle;

import com.alibaba.excel.EasyExcel;
import com.example.demo.dto.file.ImportCommentListener;
import com.example.demo.dto.file.UploadFileArgsDTO;
import com.example.demo.dto.file.UploadFileDataDTO;
import com.example.demo.entity.TblImportComment;
import com.example.demo.enums.CommonConst;
import com.example.demo.service.impl.TblImportCommentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class FileHandle {
    @Autowired
    private TblImportCommentServiceImpl tblImportCommentService;
    public void saveComment(UploadFileArgsDTO args) throws Exception {
        ImportCommentListener listener = new ImportCommentListener();
        EasyExcel.read(args.getFile().getInputStream(), UploadFileDataDTO.class,listener).sheet().doRead();
//        System.out.println(listener.getList());
        List<TblImportComment> list = new ArrayList<>();
        for (UploadFileDataDTO data : listener.getList()){
            list.add(TblImportComment.builder()
                    .addBy("icy")
                    .content(data.getContent())
                    .status(CommonConst.STATUS_ON)
                    .topicID(args.getTopicID())
                    .userID(args.getUserID())
                    .build());
        }
        System.out.println(list);

    }
}
