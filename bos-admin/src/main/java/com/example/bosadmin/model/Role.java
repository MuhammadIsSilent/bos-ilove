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
@ApiModel(value = "角色", description = "角色")
@Data
@TableName(value = "BOS_ROLE")
public class Role {


    /**
     * oracle 主键使用插入模式,而不是自增
     */
    @TableId(value = "ID", type = IdType.INPUT)
    @ApiModelProperty(value = "Id")
    private String id;

    @ApiModelProperty(value = "类型")
    private Integer type;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "title")
    private String title;

    @ApiModelProperty(value = "", hidden = true)
    private Boolean flag;

    @ApiModelProperty(value = "简介")
    private String describe;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    @ApiModelProperty(value = "创建者")
    private Integer creater;


}
