package org.springframework.qingsp.mybatis_spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.qingsp.mybatis_spring.interfaces.A;
import org.springframework.qingsp.mybatis_spring.interfaces.D;

/**
 * @author qingsp
 * @date 2021/5/14 16:30
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(Scanner.class);
		context.refresh();

		D d = (D) context.getBean("d");
		d.printA();

		A a = (A) context.getBean("a");
		a.print();
	}
}
