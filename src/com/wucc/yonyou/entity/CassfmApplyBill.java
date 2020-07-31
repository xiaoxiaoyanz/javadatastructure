package com.wucc.yonyou.entity;

import java.io.Serializable;

/**
 * (CassfmApplyBill)实体类
 *
 * @author makejava
 * @since 2020-07-22 16:51:29
 */
public class CassfmApplyBill implements Serializable {
    private static final long serialVersionUID = -63169218183284047L;
    /**
    * ID
    */
    private String id;
    /**
    * 版本号
    */
    private Double version;
    /**
    * 申请单号
    */
    private String code;
    /**
    * 申请人ID
    */
    private String applyorId;
    /**
    * 申请人CODE
    */
    private String applyorCode;
    /**
    * 申请人NAME
    */
    private String applyorName;
    /**
    * 申请部门ID
    */
    private String applyDeptId;
    /**
    * 申请部门CODE
    */
    private String applyDeptCode;
    /**
    * 申请部门NAME
    */
    private String applyDeptName;
    /**
    * 申请时间
    */
    private String applytime;
    /**
    * 审核人ID
    */
    private String auditorId;
    /**
    * 审核人CODE
    */
    private String auditorCode;
    /**
    * 审核NAME
    */
    private String auditorName;
    /**
    * 审核时间
    */
    private String auditname;
    /**
    * 审核状态：0初始，1已送审，2，审核完成
    */
    private String auditStatus;
    /**
    * 单据状态：-1暂存，0未送审，1已送审，2，审核完成
    */
    private String status;
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
    private String creationtime;
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
    private String modifiedtime;
    /**
    * 申请总金额
    */
    private Double applyTotalAmount;
    /**
    * 申请类别编码，1是核增0是核减，默认为核增
    */
    private String checkTypeCode;
    /**
    * 申请类别名称
    */
    private String checkTypeName;
    /**
    * 是否政府采购：1是0否
    */
    private String isGovProcure;
    /**
    * 补助资金申请依据
    */
    private String applyAcccording;
    /**
    * 补助资金申请理由
    */
    private String applyReason;
    /**
    * 申请单类型1是省厅申请单0是市县申请单
    */
    private String applyType;
    /**
    * 操作列
    */
    private String operation;
    /**
    * 单位ID
    */
    private String orgId;
    /**
    * 单位CODE
    */
    private String orgCode;
    /**
    * 单位NAME
    */
    private String orgName;
    /**
    * 区划
    */
    private String rgCode;
    /**
    * 年度
    */
    private String setYear;
    /**
    * 备注
    */
    private String remark;
    /**
    * 省厅列支账户编码
    */
    private String payAccountPCode;
    /**
    * 省厅列支账户名称
    */
    private String payAccountPName;


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

    public String getApplyorId() {
        return applyorId;
    }

    public void setApplyorId(String applyorId) {
        this.applyorId = applyorId;
    }

    public String getApplyorCode() {
        return applyorCode;
    }

    public void setApplyorCode(String applyorCode) {
        this.applyorCode = applyorCode;
    }

    public String getApplyorName() {
        return applyorName;
    }

    public void setApplyorName(String applyorName) {
        this.applyorName = applyorName;
    }

    public String getApplyDeptId() {
        return applyDeptId;
    }

    public void setApplyDeptId(String applyDeptId) {
        this.applyDeptId = applyDeptId;
    }

    public String getApplyDeptCode() {
        return applyDeptCode;
    }

    public void setApplyDeptCode(String applyDeptCode) {
        this.applyDeptCode = applyDeptCode;
    }

    public String getApplyDeptName() {
        return applyDeptName;
    }

    public void setApplyDeptName(String applyDeptName) {
        this.applyDeptName = applyDeptName;
    }

    public String getApplytime() {
        return applytime;
    }

    public void setApplytime(String applytime) {
        this.applytime = applytime;
    }

    public String getAuditorId() {
        return auditorId;
    }

    public void setAuditorId(String auditorId) {
        this.auditorId = auditorId;
    }

    public String getAuditorCode() {
        return auditorCode;
    }

    public void setAuditorCode(String auditorCode) {
        this.auditorCode = auditorCode;
    }

    public String getAuditorName() {
        return auditorName;
    }

    public void setAuditorName(String auditorName) {
        this.auditorName = auditorName;
    }

    public String getAuditname() {
        return auditname;
    }

    public void setAuditname(String auditname) {
        this.auditname = auditname;
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

    public String getModifiedtime() {
        return modifiedtime;
    }

    public void setModifiedtime(String modifiedtime) {
        this.modifiedtime = modifiedtime;
    }

    public Double getApplyTotalAmount() {
        return applyTotalAmount;
    }

    public void setApplyTotalAmount(Double applyTotalAmount) {
        this.applyTotalAmount = applyTotalAmount;
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

    public String getApplyAcccording() {
        return applyAcccording;
    }

    public void setApplyAcccording(String applyAcccording) {
        this.applyAcccording = applyAcccording;
    }

    public String getApplyReason() {
        return applyReason;
    }

    public void setApplyReason(String applyReason) {
        this.applyReason = applyReason;
    }

    public String getApplyType() {
        return applyType;
    }

    public void setApplyType(String applyType) {
        this.applyType = applyType;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
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

    public String getRgCode() {
        return rgCode;
    }

    public void setRgCode(String rgCode) {
        this.rgCode = rgCode;
    }

    public String getSetYear() {
        return setYear;
    }

    public void setSetYear(String setYear) {
        this.setYear = setYear;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

}