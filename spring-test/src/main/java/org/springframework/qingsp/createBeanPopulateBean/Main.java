package org.springframework.qingsp.createBeanPopulateBean;

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

		System.out.println(((A) context.getBean("a")).getE());

		System.out.println(((A) context.getBean("a")).getB());
		System.out.println(((A) context.getBean("a")).getD());
		System.out.println(((A) context.getBean("a")).getMyObjectFactory());
		System.out.println(((A) context.getBean("a")).getMyObjectProvider());

		System.out.println(((A) context.getBean("a")).getC());

		System.out.println(((A) context.getBean("a")).getName());
	}
}
