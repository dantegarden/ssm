package com.letinvr.web.vo;

import lombok.Data;

@Data
public class UserLoginVo {
    private String username;
    private String password;
    private String randomStr;
    private String code;
    private String grantType;
    private String scope;
}
