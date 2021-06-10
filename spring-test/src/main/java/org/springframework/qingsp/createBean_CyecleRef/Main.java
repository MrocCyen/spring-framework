package org.springframework.qingsp.createBean_CyecleRef;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author qingsp
 * @date 2021/5/14 16:30
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Scanner.class);

		System.out.println(((A) context.getBean("a")).getDesc());
		System.out.println(((B) context.getBean("b")).getDesc());
	}
}
