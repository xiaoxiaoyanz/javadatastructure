package com.wucc.jdk8;

import com.wucc.jdk8.Impl.FilterUserByAge;
import com.wucc.jdk8.Impl.FilterUserBySalary;
import com.wucc.jdk8.api.MyPredicate;
import com.wucc.jdk8.bean.User;
import org.junit.Test;

import java.util.*;

public class lambda {
	@Test
	public void Test01(){
		Comparator<Integer> comparable = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return Integer.compare(o1,o2);
			}
		};
		TreeSet<Integer>  treeSet = new TreeSet<>(comparable);
	}

	public void  test02(){
		Comparator<Integer> comparable = (x,y) -> Integer.compare(x,y);
		TreeSet<Integer>  treeSet = new TreeSet<>(comparable);
	}



	//例子

	List<User> userList = Arrays.asList(
			new User("zhangsan",30,3000),
			new User("lisi",40,4000),
			new User("wangwu",50,5000)
			);
	List<User> userList01 = new ArrayList<User>(){
		{
			add(new User("wan",300,4000));
		}
	};

	public List<User> filterUser(List<User> userList){
		List<User> emp = new ArrayList<>();
		for (User user : userList){
			if(user.getAge() > 30){
				emp.add(user);
			}
		}
		return emp;
	}
	@Test
	public void test03(){
		List<User> users = filterUser(userList);
		for (User user : users){
			System.out.println(user);
		}
	}

	//优化方式一：使用设计模式过滤  策略设计模式

	public  List<User> fitlerUserByDesign(List<User> userList, MyPredicate<User> myPredicate){
		List<User> emp = new ArrayList<>();
		for (User user : userList){
			if(myPredicate.test(user)){
				emp.add(user);
			}
		}
		return emp;
	}

	@Test
	public void test04(){
		List<User> users = fitlerUserByDesign(userList, new FilterUserByAge());
		for (User user : users){
			System.out.println(user);
		}

	}

	@Test
	public void test05(){
		List<User> users = fitlerUserByDesign(userList, new FilterUserBySalary());
		for (User user : users){
			System.out.println(user);
		}

	}

	//优化方式二：匿名内部类
	@Test
	public void test06(){
		List<User> users = fitlerUserByDesign(userList, new MyPredicate<User>() {
			@Override
			public boolean test(User user) {
				return "zhangsan".equals(user.getName());
			}
		});
		for (User user : users){
			System.out.println(user);
		}

	}

	//优化方式三：使用lambda表达式

	@Test
	public void test07() {
		List<User> users;
		users = fitlerUserByDesign(userList, (e) -> "zhangsan".equals(e.getName()));

	    /*	for (User user : users) {
			System.out.println(user);
		}*/
	    users.forEach(System.out::println);

	}

	//优化方式四：
	@Test
	public void test08() {
		userList.stream()
				//.filter((e) -> "zhangsan".equals(e.getName()))
				.limit(1)
				.forEach(System.out::println);
		userList.stream()
				.map(User::getName)
				.forEach(System.out::println);



	}


}
