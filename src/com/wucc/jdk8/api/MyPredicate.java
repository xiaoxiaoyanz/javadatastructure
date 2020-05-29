package com.wucc.jdk8.api;


@FunctionalInterface
public interface MyPredicate<T> {
	 boolean test(T t);
}
