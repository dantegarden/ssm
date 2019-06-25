package com.letinvr.service.user.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.letinvr.dao.mapper.SysUserMapper;
import com.letinvr.dao.model.entity.SysUser;
import com.letinvr.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class UserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements UserService {

    @Autowired
    private SysUserMapper userMapper;

    @Override
    public List<SysUser> findAll() {
        return userMapper.findUsers();
    }
}
