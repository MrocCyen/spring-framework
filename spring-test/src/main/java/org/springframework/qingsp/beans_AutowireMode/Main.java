package org.springframework.qingsp.beans_AutowireMode;

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

		FoodOne foodOne = (FoodOne) context.getBean("foodOne");
		System.out.println(foodOne);
		System.out.println(foodOne.getFoodTwo());
		System.out.println(foodOne.getFoodThree());

		AppleOne appleOne = (AppleOne) context.getBean("appleOne");
		System.out.println(appleOne.getAppleTwo());
		System.out.println(appleOne.getAppleThree());
		System.out.println(appleOne.getAppleFour());
	}
}
