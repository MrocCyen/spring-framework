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
		ConfigurationBean1 configurationBean1 = (ConfigurationBean1) context.getBean("configurationBean1");
		System.out.println(configurationBean1.getName());
	}
}
