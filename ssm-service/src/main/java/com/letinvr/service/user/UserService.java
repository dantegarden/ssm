package com.letinvr.service.user;

import com.letinvr.dao.model.entity.SysUser;

import java.util.List;

public interface UserService {

    public List<SysUser> findAll();
}
