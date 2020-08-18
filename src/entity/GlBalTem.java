package entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 凭证表(GlBalTem)实体类
 *
 * @author makejava
 * @since 2020-08-07 23:24:38
 */
public class GlBalTem implements Serializable {
	private static final long serialVersionUID = -36063529923843531L;
	/**
	 * 主键
	 */
	private String id;
	/**
	 * 区划
	 */
	private String rgCode;
	/**
	 * 年度
	 */
	private Double setYear;
	/**
	 * 记账凭证编号
	 */
	private String jzpzCode;
	/**
	 * 记账凭证类型
	 */
	private String jzpzType;
	/**
	 * 记账凭证日期
	 */
	private Date jzpzDate;
	/**
	 * 记账凭证摘要
	 */
	private String jzpzAbstract;
	/**
	 * 记账凭证行号
	 */
	private String jzpzNum;
	/**
	 * 科目编号
	 */
	private String accoCode;
	/**
	 * 科目名称
	 */
	private String accoName;
	/**
	 * 文号名称
	 */
	private String docCode;
	/**
	 * 文号编码
	 */
	private String docName;
	/**
	 * 借方本币金额
	 */
	private Double drAmt;
	/**
	 * 贷方本币金额
	 */
	private Double crAmt;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getJzpzCode() {
		return jzpzCode;
	}

	public void setJzpzCode(String jzpzCode) {
		this.jzpzCode = jzpzCode;
	}

	public String getJzpzType() {
		return jzpzType;
	}

	public void setJzpzType(String jzpzType) {
		this.jzpzType = jzpzType;
	}

	public Date getJzpzDate() {
		return jzpzDate;
	}

	public void setJzpzDate(Date jzpzDate) {
		this.jzpzDate = jzpzDate;
	}

	public String getJzpzAbstract() {
		return jzpzAbstract;
	}

	public void setJzpzAbstract(String jzpzAbstract) {
		this.jzpzAbstract = jzpzAbstract;
	}

	public String getJzpzNum() {
		return jzpzNum;
	}

	public void setJzpzNum(String jzpzNum) {
		this.jzpzNum = jzpzNum;
	}

	public String getAccoCode() {
		return accoCode;
	}

	public void setAccoCode(String accoCode) {
		this.accoCode = accoCode;
	}

	public String getAccoName() {
		return accoName;
	}

	public void setAccoName(String accoName) {
		this.accoName = accoName;
	}

	public String getDocCode() {
		return docCode;
	}

	public void setDocCode(String docCode) {
		this.docCode = docCode;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public Double getDrAmt() {
		return drAmt;
	}

	public void setDrAmt(Double drAmt) {
		this.drAmt = drAmt;
	}

	public Double getCrAmt() {
		return crAmt;
	}

	public void setCrAmt(Double crAmt) {
		this.crAmt = crAmt;
	}

}