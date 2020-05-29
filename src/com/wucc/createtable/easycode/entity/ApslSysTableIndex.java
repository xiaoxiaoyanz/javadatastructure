package com.wucc.createtable.easycode.entity;

import java.io.Serializable;

/**
 * (ApslSysTableIndex)实体类
 *
 * @author makejava
 * @since 2020-05-29 15:24:05
 */
public class ApslSysTableIndex implements Serializable {
    private static final long serialVersionUID = 250438410654149210L;
    /**
    * 索引主键
    */
    private String indexId;
    /**
    * 表ID
    */
    private String tableId;
    /**
    * 如果索引不能包括重复词，则为0。如果可以，则为1
    */
    private String nonUnique;
    /**
    * 索引名称
    */
    private String keyName;
    /**
    * 索引中的列序列号，从1开始
    */
    private Integer seqInDex;
    /**
    * 列存储在索引中的方式，A为升序，null无分类
    */
    private String collation;
    /**
    * 索引中唯一值的数目的估计值
    */
    private Integer cardinality;
    /**
    * 索引类型
    */
    private String indexType;


    public String getIndexId() {
        return indexId;
    }

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public String getNonUnique() {
        return nonUnique;
    }

    public void setNonUnique(String nonUnique) {
        this.nonUnique = nonUnique;
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public Integer getSeqInDex() {
        return seqInDex;
    }

    public void setSeqInDex(Integer seqInDex) {
        this.seqInDex = seqInDex;
    }

    public String getCollation() {
        return collation;
    }

    public void setCollation(String collation) {
        this.collation = collation;
    }

    public Integer getCardinality() {
        return cardinality;
    }

    public void setCardinality(Integer cardinality) {
        this.cardinality = cardinality;
    }

    public String getIndexType() {
        return indexType;
    }

    public void setIndexType(String indexType) {
        this.indexType = indexType;
    }

}