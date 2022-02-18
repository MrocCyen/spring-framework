package org.springframework.qingsp.createBean_DetermineConstructors;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author qingsp
 * @date 2021/5/14 16:30
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(Scanner.class);
		context.refresh();

		AppleOne appleOne = (AppleOne) context.getBean("appleOne");
		System.out.println(appleOne.getAppleTwo());
		System.out.println(appleOne.getAppleThree());
		System.out.println(appleOne.getAppleFour());
	}
}
