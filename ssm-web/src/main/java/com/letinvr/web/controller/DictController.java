package com.letinvr.web.controller;

import com.letinvr.common.bean.DataMsg;
import com.letinvr.common.bean.PageData;
import com.letinvr.common.bean.Result;
import com.letinvr.dao.model.entity.SysCode;
import com.letinvr.service.dict.DictService;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/dict")
public class DictController {

    private static final Logger logger = LoggerFactory.getLogger(DictController.class);

    @Autowired
    private DictService dictService;

    @RequestMapping("/list")
    public Result listPage(@RequestParam HashMap<String,Object> queryParams){
        DataMsg dataMsg = DataMsg.getInstance(queryParams);
        PageData pageData = dictService.fetchDictList(dataMsg);
        return Result.ok(pageData);
    }

    @PostMapping("/save")
    public Result saveDict(@ModelAttribute SysCode sysCode){
        boolean b = dictService.saveOrUpdate(sysCode);
        return Result.ok(b);
    }

    @DeleteMapping("/remove")
    public Result removeDict(@RequestParam("ids[]") List<Integer> ids){
        if(CollectionUtils.isNotEmpty(ids)){
            dictService.removeByIds(ids);
        }
        return Result.ok(Boolean.TRUE);
    }
}
