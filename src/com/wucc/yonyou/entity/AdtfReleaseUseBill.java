package com.wucc.yonyou.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 转移支付使用登记主单(AdtfReleaseUseBill)实体类
 *
 * @author makejava
 * @since 2020-07-23 13:59:22
 */
public class AdtfReleaseUseBill implements Serializable {
    private static final long serialVersionUID = 930953353238806945L;
    /**
    * 主键
    */
    private Long id;
    /**
    * 编码
    */
    private String code;
    /**
    * 版本
    */
    private Integer version;
    /**
    * 单据状态 -2初始状态 -1草稿 0待送审 1已送审 2审核完成
    */
    private String status;
    /**
    * 文号
    */
    private String docNoCode;
    /**
    * 文号
    */
    private String docNoName;
    /**
    * 经费年度
    */
    private Integer fundsYear;
    /**
    * 关键字
    */
    private String keyWords;
    /**
    * 凭证号
    */
    private String certifiNo;
    /**
    * 附件张数
    */
    private String annexCount;
    /**
    * 执行金额
    */
    private Double excuteMoney;
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
    /**
    * 单位名称
    */
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
    * 最后修改日期
    */
    private Date modifiedtime;
    /**
    * 区划
    */
    private String rgCode;
    /**
    * 年度
    */
    private Integer setYear;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDocNoCode() {
        return docNoCode;
    }

    public void setDocNoCode(String docNoCode) {
        this.docNoCode = docNoCode;
    }

    public String getDocNoName() {
        return docNoName;
    }

    public void setDocNoName(String docNoName) {
        this.docNoName = docNoName;
    }

    public Integer getFundsYear() {
        return fundsYear;
    }

    public void setFundsYear(Integer fundsYear) {
        this.fundsYear = fundsYear;
    }

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    public String getCertifiNo() {
        return certifiNo;
    }

    public void setCertifiNo(String certifiNo) {
        this.certifiNo = certifiNo;
    }

    public String getAnnexCount() {
        return annexCount;
    }

    public void setAnnexCount(String annexCount) {
        this.annexCount = annexCount;
    }

    public Double getExcuteMoney() {
        return excuteMoney;
    }

    public void setExcuteMoney(Double excuteMoney) {
        this.excuteMoney = excuteMoney;
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

    public String getSysType() {
        return sysType;
    }

    public void setSysType(String sysType) {
        this.sysType = sysType;
    }

}