package com.wucc.optionalnull;

public class User {
	private String name;
	private String sex;
	private String tellPhone;


	public User() {
	}

	public User(String name, String sex, String tellPhone) {
		this.name = name;
		this.sex = sex;
		this.tellPhone = tellPhone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getTellPhone() {
		return tellPhone;
	}

	public void setTellPhone(String tellPhone) {
		this.tellPhone = tellPhone;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", sex='" + sex + '\'' +
				", tellPhone='" + tellPhone + '\'' +
				'}';
	}
}
