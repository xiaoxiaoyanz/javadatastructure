package com.wucc.jdk8.Impl;

import com.wucc.jdk8.api.MyPredicate;
import com.wucc.jdk8.bean.User;

public class FilterUserBySalary implements MyPredicate<User> {
	@Override
	public boolean test(User user) {
		return user.getSalary() > 4000;
	}
}
