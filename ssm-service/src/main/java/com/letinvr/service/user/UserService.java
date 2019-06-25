package com.letinvr.service.user;

import com.baomidou.mybatisplus.extension.service.IService;
import com.letinvr.dao.model.entity.SysUser;

import java.util.List;

public interface UserService extends IService<SysUser> {

    public List<SysUser> findAll();
}
