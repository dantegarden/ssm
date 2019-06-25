package com.letinvr.common.bean;


import com.baomidou.mybatisplus.core.metadata.IPage;

import java.util.List;

public class PageData {

    private List list;
    private Long total;

    public PageData() {
    }

    public PageData(List list, Long total) {
        this.list = list;
        this.total = total;
    }

    public PageData(IPage pageInfo) {
        this.list = pageInfo.getRecords();
        this.total = pageInfo.getTotal();
    }

    public List getList() {
        return this.list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Long getTotal() {
        return this.total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}
