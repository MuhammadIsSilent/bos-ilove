package com.example.bosadmin.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.KeySequence;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.bosadmin.constant.PermissionTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/***
 *  oracle主键用varchar2
 */
@KeySequence(value = "SEQ_ORACLE_STRING_KEY", clazz = String.class)
@Data
@ApiModel(value = "权限", description = "权限")
@TableName(value = "BOS_PERMISSION")
public class Permission {

    /**
     * oracle 主键使用插入模式,而不是自增
     */
    @TableId(value = "ID", type = IdType.INPUT)
    @ApiModelProperty(value = "Id")
    private String id;

    @ApiModelProperty(value = "类型")
    private PermissionTypeEnum type;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "标题")
    private String title;

    @ApiModelProperty(value = "软删除标志", hidden = true)
    private Boolean flag;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;


}
