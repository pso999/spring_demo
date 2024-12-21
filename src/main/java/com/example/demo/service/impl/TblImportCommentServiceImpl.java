package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.mapper.TblImportCommentMapper;
import com.example.demo.entity.TblImportComment;
import com.example.demo.service.TblImportCommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author icy
 * @since 2024-12-15
 */
@Service
public class TblImportCommentServiceImpl extends ServiceImpl<TblImportCommentMapper, TblImportComment> implements TblImportCommentService {

    public List<TblImportComment> getListById(String id) {
        QueryWrapper<TblImportComment> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", id);
        return list(queryWrapper);
    }
}
