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

		System.out.println("custom:" + appleOne.getAppleTwo());
		AppleTwo appleTwo = (AppleTwo) context.getBean("appleTwo");
		System.out.println("autowire:" + appleTwo);

		System.out.println("custom:" + appleOne.getAppleThree());
		AppleThree appleThree = (AppleThree) context.getBean("appleThree");
		System.out.println("autowire:" + appleThree);

		System.out.println("custom:" + appleOne.getAppleFour());
		AppleFour appleFour = (AppleFour) context.getBean("appleFour");
		System.out.println("autowire:" + appleFour);
	}
}
