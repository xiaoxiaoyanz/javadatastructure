package entity;

import java.io.Serializable;

/**
 * 业务因素要素表(AdtfEleWorkFactor)实体类
 *
 * @author makejava
 * @since 2020-08-07 13:16:48
 */
public class AdtfEleWorkFactor implements Serializable {
	private static final long serialVersionUID = 288592509863076275L;
	/**
	 * 唯一标识本条要素信息，使用GUID机制实现唯一区分码
	 */
	private String chrId;
	/**
	 * 对应要素表所对应的要素编码
	 */
	private String eleCode;
	/**
	 * 用于显示、打印、要素树的编码显示
	 */
	private String chrCode;
	/**
	 * 用于显示、打印、要素树的名称显示
	 */
	private String chrName;
	/**
	 * 全称
	 */
	private String chrFullname;
	/**
	 * 显示当前本要素的级次
	 */
	private Double levelNum;
	/**
	 * 标定是否底级叶节点
	 */
	private Double isLeaf;
	/**
	 * 标定本要素是否启用
	 */
	private Double enabled;
	/**
	 * 父级编码
	 */
	private String parentCode;
	/**
	 * 记录其父级ID
	 */
	private String parentId;
	/**
	 * 单位代码
	 */
	private String agencyCode;
	/**
	 * 账套，系统科目账套为“*”
	 */
	private String acctCode;
	/**
	 * 下发后是否允许增加下级
	 */
	private String allowAddsub;
	/**
	 * 分区域维护各要素数据，实现多区域、多年度同时操作。
	 */
	private String rgCode;
	/**
	 * 记录当前业务年度
	 */
	private Double setYear;
	/**
	 * 创建时间 YYYY-MM-DD HH:MM:SS
	 */
	private String createDate;
	/**
	 * 创建用户
	 */
	private String createUser;
	/**
	 * 最后修改时间： YYYY-MM-DD HH:MM:SS
	 */
	private String latestOpDate;
	/**
	 * 标定是否删除
	 */
	private Double isDeleted;
	/**
	 * 最后修改用户
	 */
	private String latestOpUser;
	/**
	 * 最后版本： YYYY-MM-DD HH:MM:SS
	 */
	private Double lastVer;
	/**
	 * 使用次数
	 */
	private Double useCount;
	/**
	 * 数据来源模块
	 */
	private String dataFromModule;
	/**
	 * 数据来源单位
	 */
	private String srcAgencyCode;
	/**
	 * 助记码
	 */
	private String assCode;
	/**
	 * 备注
	 */
	private String remark;


	public String getChrId() {
		return chrId;
	}

	public void setChrId(String chrId) {
		this.chrId = chrId;
	}

	public String getEleCode() {
		return eleCode;
	}

	public void setEleCode(String eleCode) {
		this.eleCode = eleCode;
	}

	public String getChrCode() {
		return chrCode;
	}

	public void setChrCode(String chrCode) {
		this.chrCode = chrCode;
	}

	public String getChrName() {
		return chrName;
	}

	public void setChrName(String chrName) {
		this.chrName = chrName;
	}

	public String getChrFullname() {
		return chrFullname;
	}

	public void setChrFullname(String chrFullname) {
		this.chrFullname = chrFullname;
	}

	public Double getLevelNum() {
		return levelNum;
	}

	public void setLevelNum(Double levelNum) {
		this.levelNum = levelNum;
	}

	public Double getIsLeaf() {
		return isLeaf;
	}

	public void setIsLeaf(Double isLeaf) {
		this.isLeaf = isLeaf;
	}

	public Double getEnabled() {
		return enabled;
	}

	public void setEnabled(Double enabled) {
		this.enabled = enabled;
	}

	public String getParentCode() {
		return parentCode;
	}

	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getAgencyCode() {
		return agencyCode;
	}

	public void setAgencyCode(String agencyCode) {
		this.agencyCode = agencyCode;
	}

	public String getAcctCode() {
		return acctCode;
	}

	public void setAcctCode(String acctCode) {
		this.acctCode = acctCode;
	}

	public String getAllowAddsub() {
		return allowAddsub;
	}

	public void setAllowAddsub(String allowAddsub) {
		this.allowAddsub = allowAddsub;
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

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getLatestOpDate() {
		return latestOpDate;
	}

	public void setLatestOpDate(String latestOpDate) {
		this.latestOpDate = latestOpDate;
	}

	public Double getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Double isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getLatestOpUser() {
		return latestOpUser;
	}

	public void setLatestOpUser(String latestOpUser) {
		this.latestOpUser = latestOpUser;
	}

	public Double getLastVer() {
		return lastVer;
	}

	public void setLastVer(Double lastVer) {
		this.lastVer = lastVer;
	}

	public Double getUseCount() {
		return useCount;
	}

	public void setUseCount(Double useCount) {
		this.useCount = useCount;
	}

	public String getDataFromModule() {
		return dataFromModule;
	}

	public void setDataFromModule(String dataFromModule) {
		this.dataFromModule = dataFromModule;
	}

	public String getSrcAgencyCode() {
		return srcAgencyCode;
	}

	public void setSrcAgencyCode(String srcAgencyCode) {
		this.srcAgencyCode = srcAgencyCode;
	}

	public String getAssCode() {
		return assCode;
	}

	public void setAssCode(String assCode) {
		this.assCode = assCode;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}