package com.wucc.yonyou.entity;

import java.io.Serializable;

/**
 * 补助项目资金下达单据(CassfmReleaseBill)实体类
 *
 * @author makejava
 * @since 2020-07-23 14:06:54
 */
public class CassfmReleaseBill implements Serializable {
    private static final long serialVersionUID = -89272492250450109L;
    /**
    * ID
    */
    private String id;
    /**
    * 版本号
    */
    private Double version;
    /**
    * 单据编码
    */
    private String code;
    /**
    * 核定总金额
    */
    private Double checkTotalAmount;
    /**
    * 审核日期
    */
    private String audittime;
    /**
    * 审核人
    */
    private String auditor;
    /**
    * 核定人
    */
    private String checkor;
    /**
    * 核定人id
    */
    private String checkorId;
    /**
    * 核定日期
    */
    private String checktime;
    /**
    * 审核结果0 初始 1审核通过 2审核未通过
    */
    private String auditResultStatus;
    /**
    * 审核状态 0 初始 1审核中 2审核结束 
    */
    private String auditStatus;
    /**
    * 状态-1 暂存 0草稿 1审核中 2办结
    */
    private String status;
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
    * 部门ID
    */
    private String deptId;
    /**
    * 部门编码
    */
    private String deptCode;
    /**
    * 部门名称
    */
    private String deptName;
    /**
    * 创建人员ID
    */
    private String creatorId;
    /**
    * 创建人员
    */
    private String creator;
    /**
    * 创建日期
    */
    private String creationtime;
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
    private String modifiedtime;
    /**
    * 区划
    */
    private String rgCode;
    /**
    * 年度
    */
    private Double setYear;
    /**
    * 备注
    */
    private String remark;
    /**
    * 项目类型编码
    */
    private String projectTypeCode;
    /**
    * 项目类型名称
    */
    private String projectTypeName;
    /**
    * 核定类型编码
    */
    private String checkTypeCode;
    /**
    * 核定类型名称
    */
    private String checkTypeName;
    /**
    * 是否政府采购 0 否  1 是
    */
    private String isGovProcure;
    /**
    * 省厅列支账户编码
    */
    private String payAccountPCode;
    /**
    * 省厅列支账户名称
    */
    private String payAccountPName;
    /**
    * 审核人编码
    */
    private String auditorCode;
    /**
    * 审核人id
    */
    private String auditorId;
    /**
    * 审核人
    */
    private String auditorName;
    /**
    * 审批意见
    */
    private String opinion;
    /**
    * 使用单位列支账户编码
    */
    private String payAccountACode;
    /**
    * 使用单位列支账户名称
    */
    private String payAccountAName;
    /**
    * 下达类型 0 省厅下达 1市县下达
    */
    private String releaseType;
    /**
    * 核定项目编码
    */
    private String auditProCode;
    /**
    * 核定项目名称
    */
    private String auditProName;
    /**
    * 操作列
    */
    private String operation;
    /**
    * 是否涉密
    */
    private String isSecret;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getVersion() {
        return version;
    }

    public void setVersion(Double version) {
        this.version = version;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getCheckTotalAmount() {
        return checkTotalAmount;
    }

    public void setCheckTotalAmount(Double checkTotalAmount) {
        this.checkTotalAmount = checkTotalAmount;
    }

    public String getAudittime() {
        return audittime;
    }

    public void setAudittime(String audittime) {
        this.audittime = audittime;
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    public String getCheckor() {
        return checkor;
    }

    public void setCheckor(String checkor) {
        this.checkor = checkor;
    }

    public String getCheckorId() {
        return checkorId;
    }

    public void setCheckorId(String checkorId) {
        this.checkorId = checkorId;
    }

    public String getChecktime() {
        return checktime;
    }

    public void setChecktime(String checktime) {
        this.checktime = checktime;
    }

    public String getAuditResultStatus() {
        return auditResultStatus;
    }

    public void setAuditResultStatus(String auditResultStatus) {
        this.auditResultStatus = auditResultStatus;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
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

    public String getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(String creationtime) {
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

    public String getModifiedtime() {
        return modifiedtime;
    }

    public void setModifiedtime(String modifiedtime) {
        this.modifiedtime = modifiedtime;
    }

    public String getRgCode() {
        return rgCode;
    }

    public void setRgCode(String rgCode) {
        this.rgCode = rgCode;
    }

    public Double getSetYear() {
        return setYear;
    }

    public void setSetYear(Double setYear) {
        this.setYear = setYear;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getProjectTypeCode() {
        return projectTypeCode;
    }

    public void setProjectTypeCode(String projectTypeCode) {
        this.projectTypeCode = projectTypeCode;
    }

    public String getProjectTypeName() {
        return projectTypeName;
    }

    public void setProjectTypeName(String projectTypeName) {
        this.projectTypeName = projectTypeName;
    }

    public String getCheckTypeCode() {
        return checkTypeCode;
    }

    public void setCheckTypeCode(String checkTypeCode) {
        this.checkTypeCode = checkTypeCode;
    }

    public String getCheckTypeName() {
        return checkTypeName;
    }

    public void setCheckTypeName(String checkTypeName) {
        this.checkTypeName = checkTypeName;
    }

    public String getIsGovProcure() {
        return isGovProcure;
    }

    public void setIsGovProcure(String isGovProcure) {
        this.isGovProcure = isGovProcure;
    }

    public String getPayAccountPCode() {
        return payAccountPCode;
    }

    public void setPayAccountPCode(String payAccountPCode) {
        this.payAccountPCode = payAccountPCode;
    }

    public String getPayAccountPName() {
        return payAccountPName;
    }

    public void setPayAccountPName(String payAccountPName) {
        this.payAccountPName = payAccountPName;
    }

    public String getAuditorCode() {
        return auditorCode;
    }

    public void setAuditorCode(String auditorCode) {
        this.auditorCode = auditorCode;
    }

    public String getAuditorId() {
        return auditorId;
    }

    public void setAuditorId(String auditorId) {
        this.auditorId = auditorId;
    }

    public String getAuditorName() {
        return auditorName;
    }

    public void setAuditorName(String auditorName) {
        this.auditorName = auditorName;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public String getPayAccountACode() {
        return payAccountACode;
    }

    public void setPayAccountACode(String payAccountACode) {
        this.payAccountACode = payAccountACode;
    }

    public String getPayAccountAName() {
        return payAccountAName;
    }

    public void setPayAccountAName(String payAccountAName) {
        this.payAccountAName = payAccountAName;
    }

    public String getReleaseType() {
        return releaseType;
    }

    public void setReleaseType(String releaseType) {
        this.releaseType = releaseType;
    }

    public String getAuditProCode() {
        return auditProCode;
    }

    public void setAuditProCode(String auditProCode) {
        this.auditProCode = auditProCode;
    }

    public String getAuditProName() {
        return auditProName;
    }

    public void setAuditProName(String auditProName) {
        this.auditProName = auditProName;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getIsSecret() {
        return isSecret;
    }

    public void setIsSecret(String isSecret) {
        this.isSecret = isSecret;
    }

}