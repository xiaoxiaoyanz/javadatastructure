package com.wucc.createtable.easycode.entity;

import java.io.Serializable;

/**
 * 元数据表(ApslSysMetadata)实体类
 *
 * @author makejava
 * @since 2020-05-29 15:23:58
 */
public class ApslSysMetadata implements Serializable {
    private static final long serialVersionUID = -25022709302160633L;
    /**
    * 主键
    */
    private String metadataId;
    /**
    * 字段编码
    */
    private String columnName;
    /**
    * 显示名称
    */
    private String title;
    /**
    * 类型
    */
    private String type;
    /**
    * 最大长度
    */
    private Object maxLength;
    /**
    * 小数位长度
    */
    private Object decimalPlace;
    /**
    * 系统类型
    */
    private String sysType;
    /**
    * 备用字段
    */
    private String remark;


    public String getMetadataId() {
        return metadataId;
    }

    public void setMetadataId(String metadataId) {
        this.metadataId = metadataId;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Object maxLength) {
        this.maxLength = maxLength;
    }

    public Object getDecimalPlace() {
        return decimalPlace;
    }

    public void setDecimalPlace(Object decimalPlace) {
        this.decimalPlace = decimalPlace;
    }

    public String getSysType() {
        return sysType;
    }

    public void setSysType(String sysType) {
        this.sysType = sysType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}