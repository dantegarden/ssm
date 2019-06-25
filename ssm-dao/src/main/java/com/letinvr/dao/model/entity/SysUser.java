package com.letinvr.dao.model.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@Data
@Accessors(chain = true)
@NoArgsConstructor
public class SysUser implements Serializable {

    private static final long serialVersionUID = 2L;

    @TableId
    private Long id;
    private String username;
    private String password;
    private String nickname;
    private Date createTime;
    private Date updateTime;
    private Boolean deleteStatus;
    private Long roleId;
    private Long orgId;
}
