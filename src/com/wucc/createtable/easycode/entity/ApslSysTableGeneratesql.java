package com.wucc.createtable.easycode.entity;

import java.io.Serializable;

/**
 * (ApslSysTableGeneratesql)实体类
 *
 * @author makejava
 * @since 2020-05-29 15:24:05
 */
public class ApslSysTableGeneratesql implements Serializable {
    private static final long serialVersionUID = -12993975950988815L;
    /**
    * 主键ID
    */
    private String generatesqlId;
    /**
    * 表ID
    */
    private String tbaleId;
    /**
    * 创建人ID
    */
    private String creatorId;
    /**
    * 创建人CODE
    */
    private String creatorCode;
    /**
    * 创建人名称
    */
    private String creatorName;
    /**
    * 创建时间
    */
    private Object creationtime;
    /**
    * 修改理由
    */
    private String modifiedReason;
    /**
    * SQL类型，0新增，1修改，2删除
    */
    private String sqlType;
    /**
    * 系统类型
    */
    private String sysType;


    public String getGeneratesqlId() {
        return generatesqlId;
    }

    public void setGeneratesqlId(String generatesqlId) {
        this.generatesqlId = generatesqlId;
    }

    public String getTbaleId() {
        return tbaleId;
    }

    public void setTbaleId(String tbaleId) {
        this.tbaleId = tbaleId;
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

    public String getModifiedReason() {
        return modifiedReason;
    }

    public void setModifiedReason(String modifiedReason) {
        this.modifiedReason = modifiedReason;
    }

    public String getSqlType() {
        return sqlType;
    }

    public void setSqlType(String sqlType) {
        this.sqlType = sqlType;
    }

    public String getSysType() {
        return sysType;
    }

    public void setSysType(String sysType) {
        this.sysType = sysType;
    }

}