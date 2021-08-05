package org.springframework.qingsp.refresh_factoryBean;

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

//		A a = (A) context.getBean("factoryBeanForA");
//		a.print();
		B b = (B) context.getBean("b");
		b.printA();
	}
}
