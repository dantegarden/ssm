package com.letinvr.service.dict;

import com.letinvr.common.bean.PageData;

public interface DictService {
    public PageData fetchDictList(Integer pageNum, Integer pageSize);
}
