package com.letinvr.dao.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors(chain = true)
@NoArgsConstructor
public class UserInfoDto {
    private Long userId;
    private String username;
    private String password;
    private String mobile;
    private String picUrl;
    private Date createTime;
    private Date updateTime;
    private Boolean deleteStatus;
}
