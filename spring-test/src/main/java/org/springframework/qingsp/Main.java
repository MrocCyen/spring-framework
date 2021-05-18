package org.springframework.qingsp;

import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.qingsp.bean.BeanDefinitionRegistryPostProcessor1;
import org.springframework.qingsp.bean.Scanner;

/**
 * @author qingsp
 * @date 2021/5/14 16:30
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(Scanner.class);
		context.registerBeanDefinition("beanDefinitionRegistryPostProcessor1", new GenericBeanDefinition() {{
			setBeanClass(BeanDefinitionRegistryPostProcessor1.class);
		}});
		context.refresh();

		System.out.println(context.getBean("a"));
	}
}
