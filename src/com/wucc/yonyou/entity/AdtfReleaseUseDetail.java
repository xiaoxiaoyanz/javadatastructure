package com.wucc.yonyou.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 使用登记使用登记执行经费明细子表(AdtfReleaseUseDetail)实体类
 *
 * @author makejava
 * @since 2020-07-23 13:59:23
 */
public class AdtfReleaseUseDetail implements Serializable {
    private static final long serialVersionUID = 920064929340562873L;
    /**
    * 主键
    */
    private Long id;
    /**
    * 主单ID
    */
    private Long billId;
    /**
    * 版本
    */
    private Integer version;
    /**
    * 指标编码
    */
    private String targetCode;
    /**
    * 指标名称
    */
    private String targetName;
    /**
    * 科目编码
    */
    private String subjectCode;
    /**
    * 科目名称
    */
    private String subjectName;
    /**
    * 金额
    */
    private Double money;
    /**
    * 区划
    */
    private String rgCode;
    /**
    * 年度
    */
    private Integer setYear;
    /**
    * 备注
    */
    private String remark;
    /**
    * 单位ID
    */
    private String orgId;
    /**
    * 单位编码
    */
    private String orgCode;
    
    private String orgName;
    /**
    * 创建人员ID
    */
    private String creatorId;
    /**
    * 创建人员
    */
    private String creator;
    /**
    * 填报/创建日期
    */
    private Date creationtime;
    /**
    * 最后修改人员ID
    */
    private String modifierId;
    /**
    * 最后修改人员
    */
    private String modifier;
    /**
    * 单位名称
    */
    private Date modifiedtime;
    /**
    * 系统类型：adtf全国转移支付，gui贵州转移支付
    */
    private String sysType;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBillId() {
        return billId;
    }

    public void setBillId(Long billId) {
        this.billId = billId;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getTargetCode() {
        return targetCode;
    }

    public void setTargetCode(String targetCode) {
        this.targetCode = targetCode;
    }

    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getRgCode() {
        return rgCode;
    }

    public void setRgCode(String rgCode) {
        this.rgCode = rgCode;
    }

    public Integer getSetYear() {
        return setYear;
    }

    public void setSetYear(Integer setYear) {
        this.setYear = setYear;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }

    public String getModifierId() {
        return modifierId;
    }

    public void setModifierId(String modifierId) {
        this.modifierId = modifierId;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public Date getModifiedtime() {
        return modifiedtime;
    }

    public void setModifiedtime(Date modifiedtime) {
        this.modifiedtime = modifiedtime;
    }

    public String getSysType() {
        return sysType;
    }

    public void setSysType(String sysType) {
        this.sysType = sysType;
    }

}