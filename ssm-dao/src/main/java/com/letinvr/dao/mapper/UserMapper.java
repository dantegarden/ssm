package com.letinvr.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.letinvr.dao.model.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<SysUser> {
    public List<SysUser> findUsers();

    public SysUser findById(@Param("id") Long id);
}
