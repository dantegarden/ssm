package com.letinvr.web.controller;

import com.letinvr.common.bean.PageData;
import com.letinvr.common.bean.Result;
import com.letinvr.service.dict.DictService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dict")
public class DictController {

    private static final Logger logger = LoggerFactory.getLogger(DictController.class);

    @Autowired
    private DictService dictService;

    @GetMapping("/list")
    public Result listPage(@RequestParam Integer page, @RequestParam Integer size){
        PageData pageData = dictService.fetchDictList(page, size);
        return Result.ok(pageData);
    }
}
