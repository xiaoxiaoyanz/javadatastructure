package com.wucc.yonyou.entity;

import java.io.Serializable;

/**
 * 补助项目资金下达单据子表(CassfmReleaseBillDetail)实体类
 *
 * @author makejava
 * @since 2020-07-23 14:06:54
 */
public class CassfmReleaseBillDetail implements Serializable {
    private static final long serialVersionUID = 607945099707105024L;
    /**
    * ID
    */
    private String id;
    
    private Double version;
    /**
    * 单据编号
    */
    private String billCode;
    /**
    * 单据ID
    */
    private String billId;
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
    * 存补助项目申请详情单id
    */
    private String modifierId;
    /**
    * 区分省厅下达还是市县下达1是省厅，0是市县
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
    * 资金来源编码
    */
    private String amountSourceCode;
    /**
    * 资金来源名称
    */
    private String amountSourceName;
    /**
    * 项目编码
    */
    private String projectCode;
    /**
    * 项目名称
    */
    private String projectName;
    /**
    * 存补助项目资金新增主单ID
    */
    private String acceptOrgId;
    /**
    * 存是否涉密项目1是涉密0不是
    */
    private String acceptOrgCode;
    /**
    * 存补助项目资金新增详情单ID
    */
    private String acceptOrgName;
    /**
    * 受补部门id
    */
    private String acceptDeptId;
    /**
    * 受补部门编码
    */
    private String acceptDeptCode;
    /**
    * 受补部门名称
    */
    private String acceptDeptName;
    /**
    * 使用单位ID
    */
    private String usedOrgId;
    /**
    * 使用单位CODE
    */
    private String usedOrgCode;
    /**
    * 使用单位NAME
    */
    private String usedOrgName;
    /**
    * 核定金额
    */
    private Double checkAmount;
    /**
    * 是否签收  0  否   1 是
    */
    private String isSign;
    /**
    * 签收人
    */
    private String signor;
    /**
    * 签收人id
    */
    private String signorId;
    /**
    * 签收人code
    */
    private String signorCode;
    /**
    * 签收日期
    */
    private String signDate;
    /**
    * 已核定省厅金额
    */
    private Double releaseAmountP;
    /**
    * 已核定市县金额
    */
    private Double releaseAmountS;
    /**
    * 待核定金额
    */
    private Double remainAmount;
    /**
    * 分配金额
    */
    private Double totalMoney;
    /**
    * 文号编码
    */
    private String docNoCode;
    /**
    * 文号名称
    */
    private String docNoName;


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

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
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

    public String getAmountSourceCode() {
        return amountSourceCode;
    }

    public void setAmountSourceCode(String amountSourceCode) {
        this.amountSourceCode = amountSourceCode;
    }

    public String getAmountSourceName() {
        return amountSourceName;
    }

    public void setAmountSourceName(String amountSourceName) {
        this.amountSourceName = amountSourceName;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getAcceptOrgId() {
        return acceptOrgId;
    }

    public void setAcceptOrgId(String acceptOrgId) {
        this.acceptOrgId = acceptOrgId;
    }

    public String getAcceptOrgCode() {
        return acceptOrgCode;
    }

    public void setAcceptOrgCode(String acceptOrgCode) {
        this.acceptOrgCode = acceptOrgCode;
    }

    public String getAcceptOrgName() {
        return acceptOrgName;
    }

    public void setAcceptOrgName(String acceptOrgName) {
        this.acceptOrgName = acceptOrgName;
    }

    public String getAcceptDeptId() {
        return acceptDeptId;
    }

    public void setAcceptDeptId(String acceptDeptId) {
        this.acceptDeptId = acceptDeptId;
    }

    public String getAcceptDeptCode() {
        return acceptDeptCode;
    }

    public void setAcceptDeptCode(String acceptDeptCode) {
        this.acceptDeptCode = acceptDeptCode;
    }

    public String getAcceptDeptName() {
        return acceptDeptName;
    }

    public void setAcceptDeptName(String acceptDeptName) {
        this.acceptDeptName = acceptDeptName;
    }

    public String getUsedOrgId() {
        return usedOrgId;
    }

    public void setUsedOrgId(String usedOrgId) {
        this.usedOrgId = usedOrgId;
    }

    public String getUsedOrgCode() {
        return usedOrgCode;
    }

    public void setUsedOrgCode(String usedOrgCode) {
        this.usedOrgCode = usedOrgCode;
    }

    public String getUsedOrgName() {
        return usedOrgName;
    }

    public void setUsedOrgName(String usedOrgName) {
        this.usedOrgName = usedOrgName;
    }

    public Double getCheckAmount() {
        return checkAmount;
    }

    public void setCheckAmount(Double checkAmount) {
        this.checkAmount = checkAmount;
    }

    public String getIsSign() {
        return isSign;
    }

    public void setIsSign(String isSign) {
        this.isSign = isSign;
    }

    public String getSignor() {
        return signor;
    }

    public void setSignor(String signor) {
        this.signor = signor;
    }

    public String getSignorId() {
        return signorId;
    }

    public void setSignorId(String signorId) {
        this.signorId = signorId;
    }

    public String getSignorCode() {
        return signorCode;
    }

    public void setSignorCode(String signorCode) {
        this.signorCode = signorCode;
    }

    public String getSignDate() {
        return signDate;
    }

    public void setSignDate(String signDate) {
        this.signDate = signDate;
    }

    public Double getReleaseAmountP() {
        return releaseAmountP;
    }

    public void setReleaseAmountP(Double releaseAmountP) {
        this.releaseAmountP = releaseAmountP;
    }

    public Double getReleaseAmountS() {
        return releaseAmountS;
    }

    public void setReleaseAmountS(Double releaseAmountS) {
        this.releaseAmountS = releaseAmountS;
    }

    public Double getRemainAmount() {
        return remainAmount;
    }

    public void setRemainAmount(Double remainAmount) {
        this.remainAmount = remainAmount;
    }

    public Double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
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

}