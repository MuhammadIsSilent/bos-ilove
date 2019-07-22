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
@KeySequence(value = "SEQ_ORACLE_STRING_KEY", clazz = String.class)
@Data
@ApiModel(value = "用户详细信息表")
@TableName(value = "BOS_USER_INFO")
public class UserInfo {

    /**
     * oracle 主键使用插入模式,而不是自增
     */
    @TableId(value = "ID", type = IdType.INPUT)
    @ApiModelProperty(value = "Id")
    private String id;

    @ApiModelProperty(value = "用户ID")
    private Integer userId;

    @ApiModelProperty(value = "用户ID")
    private String addreass;

    @ApiModelProperty(value = "生日")
    private Date birthday;

    @ApiModelProperty(value = "软删除, false, true ")
    private Boolean flag;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    @ApiModelProperty(value = "创建者")
    private Integer creater;


}
