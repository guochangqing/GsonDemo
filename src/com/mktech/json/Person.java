/*
 * @Title: Person.java
 * @Copyright: MKTech Corporation. Ltd. Copyright 1998-2018, All rights reserved
 * @Description: TODO<请描述此文件是做什么的>
 * @author: xjp
 * @data: 2014年7月29日 上午9:29:58
 * @version: V1.0
 */
package com.mktech.json;

import com.google.gson.annotations.Expose;

/**
 * TODO<请描述这个类是干什么的>
 * 
 * @author xjp
 * @data: 2014年7月29日 上午9:29:58
 * @version: V1.0
 */
public class Person {
	@Expose
	private String name;
	@Expose
	private int age;

	public Person() {
		super();
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
