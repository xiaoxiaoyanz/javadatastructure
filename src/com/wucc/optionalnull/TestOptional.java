package com.wucc.optionalnull;

import org.junit.Test;

import java.util.Optional;

public class TestOptional {

	@Test
	public  void test01(){

		Optional<User> op = Optional.of(new User());
		User user = op.get();
		System.out.println(user);

	}

	@Test
	public  void test02() throws Exception {

		Optional<String> cc = Optional.ofNullable(null);

		if(cc.isPresent()){
			System.out.println(cc.get());
		}

		String haha = cc.orElse("haha");

		System.out.println(haha);

		String ff = cc.orElseGet(() -> {
			try {
				throw new Exception("ff");
			} catch (Exception e) {
				e.printStackTrace();
			}
			return String.valueOf(new User());
		});

		System.out.println(ff);
	}
}
