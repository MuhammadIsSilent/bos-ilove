package com.example.bosadmin.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.KeySequence;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;


/**
 * @author ljz
 */

/***
 *  oracle主键用varchar2
 */
@KeySequence(value = "SEQ_ORACLE_STRING_KEY", clazz = String.class)
@Data
@TableName(value = "BOS_USER")
@ApiModel(value = "用户", description = "用户")
public class User {

    /**
     * oracle 主键使用插入模式,而不是自增
     */
    @TableId(value = "ID", type = IdType.INPUT)
    @ApiModelProperty(value = "Id")
    private String id;

    @ApiModelProperty(value = "用户名")
    private String userName;

    @ApiModelProperty(value = "密码")
    private String passWord;

    @ApiModelProperty(value = "盐")
    private String salt;

    @ApiModelProperty(value = "昵称")
    private String nickName;

    @ApiModelProperty(value = "性别, 0 男,1 女, 2 保密")
    private byte sex;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "软删除, false, true ")
    private Boolean flag;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    @ApiModelProperty(value = "创建者")
    private Integer creater;


}
