package com.letinvr.service.dict.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.letinvr.common.bean.PageData;
import com.letinvr.dao.mapper.SysCodeMapper;
import com.letinvr.dao.model.entity.SysCode;
import com.letinvr.service.dict.DictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class DictServiceImpl extends ServiceImpl<SysCodeMapper, SysCode> implements DictService {

    @Autowired
    private SysCodeMapper codeMapper;

    @Override
    public PageData fetchDictList(Integer pageNum, Integer pageSize){
        QueryWrapper<SysCode> queryWrapper = new QueryWrapper<>();
        Page<SysCode> page = new Page<>(pageNum, pageSize);
        IPage<SysCode> codePage = codeMapper.selectPage(page, queryWrapper);
        return new PageData(codePage);
    }
}
