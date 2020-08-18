package com.wucc.yonyou.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 转移支付警种要素(ApslElePoliceType)实体类
 *
 * @author makejava
 * @since 2020-08-06 19:50:07
 */
public class ApslElePoliceType implements Serializable {
	private static final long serialVersionUID = 452806334061541705L;
	/**
	 * 主键
	 */
	private String id;
	/**
	 * 编码
	 */
	private String code;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 助记码
	 */
	private String shortcode;
	/**
	 * 简称
	 */
	private String shortname;
	/**
	 * 全称
	 */
	private String wholename;
	/**
	 * 说明，描述
	 */
	private String description;
	/**
	 * 父节点ID
	 */
	private String parentId;
	/**
	 * 父节点编码
	 */
	private String parentCode;
	/**
	 * 当前级次
	 */
	private Integer levelNum;
	/**
	 * 是否叶子节点(1是，0否)
	 */
	private String isLeaf;
	/**
	 * 是否财政信息标识（1财政定义0自定义）
	 */
	private String isFinance;
	/**
	 * 版本号
	 */
	private Integer version;
	/**
	 * 状态1 正常 0 停用 （建议与启用，停用日期关联，查询时可不检查启用、停用日期）
	 */
	private String status;
	/**
	 * 启用日期
	 */
	private Object startdate;
	/**
	 * 停用日期
	 */
	private Object enddate;
	/**
	 * 单位ID
	 */
	private String orgId;
	/**
	 * 单位编码
	 */
	private String orgCode;
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
	 * 备注
	 */
	private String remark;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortcode() {
		return shortcode;
	}

	public void setShortcode(String shortcode) {
		this.shortcode = shortcode;
	}

	public String getShortname() {
		return shortname;
	}

	public void setShortname(String shortname) {
		this.shortname = shortname;
	}

	public String getWholename() {
		return wholename;
	}

	public void setWholename(String wholename) {
		this.wholename = wholename;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getParentCode() {
		return parentCode;
	}

	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}

	public Integer getLevelNum() {
		return levelNum;
	}

	public void setLevelNum(Integer levelNum) {
		this.levelNum = levelNum;
	}

	public String getIsLeaf() {
		return isLeaf;
	}

	public void setIsLeaf(String isLeaf) {
		this.isLeaf = isLeaf;
	}

	public String getIsFinance() {
		return isFinance;
	}

	public void setIsFinance(String isFinance) {
		this.isFinance = isFinance;
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

	public Object getStartdate() {
		return startdate;
	}

	public void setStartdate(Object startdate) {
		this.startdate = startdate;
	}

	public Object getEnddate() {
		return enddate;
	}

	public void setEnddate(Object enddate) {
		this.enddate = enddate;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}