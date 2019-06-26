package com.letinvr.service.dict.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.letinvr.common.bean.DataMsg;
import com.letinvr.common.bean.PageData;
import com.letinvr.dao.mapper.SysCodeMapper;
import com.letinvr.dao.model.entity.SysCode;
import com.letinvr.service.dict.DictService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

@Transactional
@Service
public class DictServiceImpl extends ServiceImpl<SysCodeMapper, SysCode> implements DictService {

    @Autowired
    private SysCodeMapper codeMapper;

    @Override
    public PageData fetchDictList(DataMsg dataMsg){
        Page<SysCode> page = new Page<>(dataMsg.getPage(), dataMsg.getSize());
        Map<String, Object> condition = (Map)dataMsg.getQueryCondition();
        QueryWrapper<SysCode> queryWrapper = new QueryWrapper<>();
        queryWrapper.like(StringUtils.isNotEmpty((String)condition.get("codeType")), "code_type", condition.get("codeType"));
        queryWrapper.orderBy(StringUtils.isNotEmpty(dataMsg.getOrder()), dataMsg.getIsAsc(), dataMsg.getOrder());
        IPage<SysCode> codePage = codeMapper.selectPage(page, queryWrapper);
        return new PageData(codePage);
    }
}
