package com.example.bosadmin.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.KeySequence;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/***
 *  oracle主键用varchar2
 */
@KeySequence(value = "SEQ_ORACLE_STRING_KEY",clazz = String.class)
@Data
@ApiModel(value = "用户角色")
@TableName(value = "BOS_USER_ROLE")
public class UserRole {

    /** oracle 主键使用插入模式,而不是自增  */
    @TableId(value = "ID",type = IdType.INPUT)
    @ApiModelProperty(value = "Id")
    private String id;

    @ApiModelProperty(value = "用户Id")
    private Integer userId;

    @ApiModelProperty(value = "角色Id")
    private Integer roleId;

    @ApiModelProperty(value = "软删除标志,false 正常,true 删除 ",hidden = true)
    private Boolean flag;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTIme;

}
