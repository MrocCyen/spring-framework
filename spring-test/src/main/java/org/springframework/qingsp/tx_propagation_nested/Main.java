package org.springframework.qingsp.tx_propagation_nested;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author qingsp
 * @date 2021/5/14 16:30
 */
public class Main {
	public static void main(String[] args) throws Exception {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(Scanner.class);
		context.refresh();

//		A a = (A) context.getBean("a");
//		a.print1();

		A1 a1 = (A1) context.getBean("a1");
		a1.print1();
	}
}