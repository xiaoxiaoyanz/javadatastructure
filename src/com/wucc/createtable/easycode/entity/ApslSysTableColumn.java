package com.wucc.createtable.easycode.entity;

import java.io.Serializable;

/**
 * 物理列字段表(ApslSysTableColumn)实体类
 *
 * @author makejava
 * @since 2020-05-29 15:24:05
 */
public class ApslSysTableColumn implements Serializable {
    private static final long serialVersionUID = 267954319694703050L;
    /**
    * 编号
    */
    private String columnId;
    /**
    * 表ID
    */
    private String tableId;
    /**
    * 元数据ID
    */
    private String metadataId;
    /**
    * 列名
    */
    private String columnName;
    /**
    * 字段类型
    */
    private String type;
    /**
    * 是否可为空
    */
    private String isNullable;
    /**
    * 最大长度
    */
    private Double maxLength;
    /**
    * 小数位长度
    */
    private Double decimalPlace;
    /**
    * 系统类型
    */
    private String sysType;


    public String getColumnId() {
        return columnId;
    }

    public void setColumnId(String columnId) {
        this.columnId = columnId;
    }

    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIsNullable() {
        return isNullable;
    }

    public void setIsNullable(String isNullable) {
        this.isNullable = isNullable;
    }

    public Double getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Double maxLength) {
        this.maxLength = maxLength;
    }

    public Double getDecimalPlace() {
        return decimalPlace;
    }

    public void setDecimalPlace(Double decimalPlace) {
        this.decimalPlace = decimalPlace;
    }

    public String getSysType() {
        return sysType;
    }

    public void setSysType(String sysType) {
        this.sysType = sysType;
    }

}