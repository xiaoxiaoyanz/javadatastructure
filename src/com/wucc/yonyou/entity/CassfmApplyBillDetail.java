package com.wucc.yonyou.entity;

import java.io.Serializable;

/**
 * (CassfmApplyBillDetail)实体类
 *
 * @author makejava
 * @since 2020-07-22 16:51:35
 */
public class CassfmApplyBillDetail implements Serializable {
    private static final long serialVersionUID = -43582232039881939L;
    /**
    * ID
    */
    private String id;
    /**
    * 版本号
    */
    private Double version;
    /**
    * 单据
    */
    private String billId;
    /**
    * 补助项目资金新增单据ID
    */
    private String projectId;
    /**
    * 补助项目资金新增详情单ID
    */
    private String projectDetailId;
    /**
    * 文号编码
    */
    private String docNoCode;
    /**
    * 文号名称
    */
    private String docNoName;
    /**
    * 项目类型编码
    */
    private String projectTypeCode;
    /**
    * 项目类型名称
    */
    private String projectTypeName;
    /**
    * 项目编码
    */
    private String projectCode;
    /**
    * 项目名称
    */
    private String projectName;
    /**
    * 受补部门ID
    */
    private String acceptDeptId;
    /**
    * 受补部门CODE
    */
    private String acceptDeptCode;
    /**
    * 受补部门NAME
    */
    private String acceptDeptName;
    /**
    * 使用单位ID
    */
    private String useOrgId;
    /**
    * 使用单位CODE
    */
    private String useOrgCode;
    /**
    * 使用单位NAME
    */
    private String useOrgName;
    /**
    * 总分配金额
    */
    private Double totalAssignAmount;
    /**
    * 申请金额
    */
    private Double applyAmount;
    /**
    * 已申请省厅
    */
    private Double applyAmountP;
    /**
    * 已申请市县
    */
    private Double applyAmountS;
    /**
    * 待申请
    */
    private Double remainAmount;
    /**
    * 补助项目资金新增单创建时间
    */
    private String checkedtime;
    /**
    * 详情单申请类型：1是省厅，0是市县
    */
    private String applyTypeDetail;
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
    * 省厅列支账户code
    */
    private String payAccountPCode;
    /**
    * 省厅列支账户name
    */
    private String payAccountPName;
    /**
    * 备注
    */
    private String remark;


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

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectDetailId() {
        return projectDetailId;
    }

    public void setProjectDetailId(String projectDetailId) {
        this.projectDetailId = projectDetailId;
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

    public String getUseOrgId() {
        return useOrgId;
    }

    public void setUseOrgId(String useOrgId) {
        this.useOrgId = useOrgId;
    }

    public String getUseOrgCode() {
        return useOrgCode;
    }

    public void setUseOrgCode(String useOrgCode) {
        this.useOrgCode = useOrgCode;
    }

    public String getUseOrgName() {
        return useOrgName;
    }

    public void setUseOrgName(String useOrgName) {
        this.useOrgName = useOrgName;
    }

    public Double getTotalAssignAmount() {
        return totalAssignAmount;
    }

    public void setTotalAssignAmount(Double totalAssignAmount) {
        this.totalAssignAmount = totalAssignAmount;
    }

    public Double getApplyAmount() {
        return applyAmount;
    }

    public void setApplyAmount(Double applyAmount) {
        this.applyAmount = applyAmount;
    }

    public Double getApplyAmountP() {
        return applyAmountP;
    }

    public void setApplyAmountP(Double applyAmountP) {
        this.applyAmountP = applyAmountP;
    }

    public Double getApplyAmountS() {
        return applyAmountS;
    }

    public void setApplyAmountS(Double applyAmountS) {
        this.applyAmountS = applyAmountS;
    }

    public Double getRemainAmount() {
        return remainAmount;
    }

    public void setRemainAmount(Double remainAmount) {
        this.remainAmount = remainAmount;
    }

    public String getCheckedtime() {
        return checkedtime;
    }

    public void setCheckedtime(String checkedtime) {
        this.checkedtime = checkedtime;
    }

    public String getApplyTypeDetail() {
        return applyTypeDetail;
    }

    public void setApplyTypeDetail(String applyTypeDetail) {
        this.applyTypeDetail = applyTypeDetail;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}