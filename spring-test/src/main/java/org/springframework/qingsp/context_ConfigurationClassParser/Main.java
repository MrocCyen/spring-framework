package org.springframework.qingsp.context_ConfigurationClassParser;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author qingshanpeng
 * @date 2022/2/19 10:58
 * @since 标果工厂
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Scanner.class);
		ImportD d = (ImportD) context.getBean("importD");
		System.out.println(d.getImportB());
	}
}
