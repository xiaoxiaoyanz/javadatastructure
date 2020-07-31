package com.wucc.datastructure.josephu;

import java.util.Objects;

/**
 * <p>
 *
 * <p>
 *
 * @author wudingjia
 * @date 2020-07-31 15:23
 */
public class Boy {
	private Integer numberNo;

	private Boy next;

	public Boy(Integer numberNo) {
		this.numberNo = numberNo;
	}

	public Integer getNumberNo() {
		return numberNo;
	}

	public void setNumberNo(Integer numberNo) {
		this.numberNo = numberNo;
	}

	public Boy getNext() {
		return next;
	}

	public void setNext(Boy next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Boy{" +
				"numberNo=" + numberNo +
				", next=" + next +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Boy boy = (Boy) o;
		return numberNo.equals(boy.numberNo) &&
				next.equals(boy.next);
	}

	@Override
	public int hashCode() {
		return Objects.hash(numberNo, next);
	}
}


