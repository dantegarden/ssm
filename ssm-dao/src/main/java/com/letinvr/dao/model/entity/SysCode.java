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
public class SysCode implements Serializable {

    private static final long serialVersionUID = 2L;

    @TableId
    private Long id;
    private String codeKey;
    private String codeName;
    private String codeType;
    private String codeValue;
    private Boolean enabled;
    private Integer orderNumber;
    private Date createTime;
    private Date updateTime;
}
