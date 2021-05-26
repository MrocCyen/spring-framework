package org.springframework.qingsp.isSynthetic;

import java.lang.reflect.Method;

/**
 * @author qingsp
 * @date 2021/5/26 10:35
 * @since 标果工厂-玫瑰香
 */
public class Main {
	public static void main(String[] args) {
		Method[] methods = User.class.getDeclaredMethods();
		//这里实现化user对象时调用了私有构造器
		User user = new User();
		//这里也访问了私有变量
		user.age = 1;
		for (Method method : methods) {
			System.out.println(method.toString() + "," + method.isSynthetic() + method.isBridge());
		}

		System.out.println(user.getClass().isSynthetic());
	}

	static class User {
		private int age;
		private String name;

		private User() {

		}

		private User(int age, String name) {
			this.age = age;
			this.name = name;
		}

		private int getAge() {
			return age;
		}

		private void setAge(int age) {
			this.age = age;
		}

		private String getName() {
			return name;
		}

		private void setName(String name) {
			this.name = name;
		}
	}
}
