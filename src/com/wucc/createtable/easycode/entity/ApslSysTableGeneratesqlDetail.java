package com.wucc.createtable.easycode.entity;

import java.io.Serializable;

/**
 * (ApslSysTableGeneratesqlDetail)实体类
 *
 * @author makejava
 * @since 2020-05-29 15:24:05
 */
public class ApslSysTableGeneratesqlDetail implements Serializable {
    private static final long serialVersionUID = 426381187135342945L;
    /**
    * 主键ID
    */
    private String id;
    /**
    * 主表ID
    */
    private String generatesqlId;
    /**
    * 生成的SQL
    */
    private Object generatesql;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGeneratesqlId() {
        return generatesqlId;
    }

    public void setGeneratesqlId(String generatesqlId) {
        this.generatesqlId = generatesqlId;
    }

    public Object getGeneratesql() {
        return generatesql;
    }

    public void setGeneratesql(Object generatesql) {
        this.generatesql = generatesql;
    }

}