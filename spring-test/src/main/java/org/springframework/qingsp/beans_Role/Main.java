package org.springframework.qingsp.beans_Role;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author qingshanpeng
 * @date 2022/2/21 15:50
 * @since 标果工厂
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Scanner.class);
		ApplicationConfigurationClassRole1 applicationConfigurationClassRole1 =
				(ApplicationConfigurationClassRole1) context.getBean("applicationConfigurationClassRole1");
		System.out.println(applicationConfigurationClassRole1.getName());
	}
}
