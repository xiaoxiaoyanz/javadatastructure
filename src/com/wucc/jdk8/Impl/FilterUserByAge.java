package com.wucc.jdk8.Impl;

import com.wucc.jdk8.api.MyPredicate;
import com.wucc.jdk8.bean.User;

public class FilterUserByAge implements MyPredicate<User> {
	@Override
	public boolean test(User user) {
		return user.getAge() > 30;
	}
}
