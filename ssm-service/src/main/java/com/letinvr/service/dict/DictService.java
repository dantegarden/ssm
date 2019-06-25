package com.letinvr.service.dict;

import com.baomidou.mybatisplus.extension.service.IService;
import com.letinvr.common.bean.PageData;
import com.letinvr.dao.model.entity.SysCode;

public interface DictService extends IService<SysCode> {
    public PageData fetchDictList(Integer pageNum, Integer pageSize);
}
