package org.springframework.qingsp.test_CustomAutowireConfigurer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.qingsp.test_getMergedBeanDefinition.Scanner;

/**
 * @author qingsp
 * @date 2021/5/14 16:30
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(Scanner.class);
		context.refresh();

		((QualifierB) (context.getBean("qualifierB"))).print();
		((QualifierB) (context.getBean("qualifierB"))).getQualifierA().print();
	}
}
