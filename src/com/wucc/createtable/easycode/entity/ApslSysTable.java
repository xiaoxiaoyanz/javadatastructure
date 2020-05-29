package com.wucc.createtable.easycode.entity;

import java.io.Serializable;

/**
 * 物理表(ApslSysTable)实体类
 *
 * @author makejava
 * @since 2020-05-29 15:24:04
 */
public class ApslSysTable implements Serializable {
    private static final long serialVersionUID = 877628795990484382L;
    /**
    * 主键
    */
    private String tableId;
    /**
    * 表名
    */
    private String tableName;
    /**
    * 创建人ID
    */
    private String creatorId;
    /**
    * 创建人CODE
    */
    private String creatorCode;
    /**
    * 创建人NAME
    */
    private String creatorName;
    /**
    * 创建时间
    */
    private Object creationtime;
    /**
    * 修改人ID
    */
    private String modifierId;
    /**
    * 修改人CODE
    */
    private String modifierCode;
    /**
    * 修改人NAME
    */
    private String modifierName;
    /**
    * 修改时间
    */
    private Object modifiedtime;
    /**
    * 系统类型
    */
    private String sysType;


    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public String getCreatorCode() {
        return creatorCode;
    }

    public void setCreatorCode(String creatorCode) {
        this.creatorCode = creatorCode;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public Object getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(Object creationtime) {
        this.creationtime = creationtime;
    }

    public String getModifierId() {
        return modifierId;
    }

    public void setModifierId(String modifierId) {
        this.modifierId = modifierId;
    }

    public String getModifierCode() {
        return modifierCode;
    }

    public void setModifierCode(String modifierCode) {
        this.modifierCode = modifierCode;
    }

    public String getModifierName() {
        return modifierName;
    }

    public void setModifierName(String modifierName) {
        this.modifierName = modifierName;
    }

    public Object getModifiedtime() {
        return modifiedtime;
    }

    public void setModifiedtime(Object modifiedtime) {
        this.modifiedtime = modifiedtime;
    }

    public String getSysType() {
        return sysType;
    }

    public void setSysType(String sysType) {
        this.sysType = sysType;
    }

}