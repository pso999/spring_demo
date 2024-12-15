package com.example.demo.dto.file;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

import java.util.ArrayList;
import java.util.List;

public class ImportCommentListener extends AnalysisEventListener<UploadFileDataDTO> {

    List<UploadFileDataDTO> list = new ArrayList<UploadFileDataDTO>();

    public ImportCommentListener() {}

    public void invoke(UploadFileDataDTO data, AnalysisContext context) {

        this.list.add(data);
    }
    public void doAfterAllAnalysed(AnalysisContext context) {}

    public List<UploadFileDataDTO> getList() {
        return this.list;
    }
}
