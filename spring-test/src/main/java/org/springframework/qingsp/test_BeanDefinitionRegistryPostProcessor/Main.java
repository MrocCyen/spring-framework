package org.springframework.qingsp.test_BeanDefinitionRegistryPostProcessor;

import org.springframework.beans.factory.support.GenericBeanDefinition;
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
		context.registerBeanDefinition("myBeanDefinitionRegistryPostProcessor", new GenericBeanDefinition() {{
			setBeanClass(MyBeanDefinitionRegistryPostProcessor.class);
		}});
		context.refresh();
	}
}
