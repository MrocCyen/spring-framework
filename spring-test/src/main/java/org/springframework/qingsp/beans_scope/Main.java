package org.springframework.qingsp.beans_scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.qingsp.createBean_Aop_CyecleRef.A;

/**
 * @author qingsp
 * @date 2021/5/14 16:30
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(Scanner.class);
		context.refresh();

		((MyScopeBean) context.getBean("myScopeBean")).print();
		((MyScopeBean) context.getBean("myScopeBean")).print();
		((MyScopeBean) context.getBean("myScopeBean")).print();
	}
}
