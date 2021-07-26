package org.springframework.qingsp.refresh_CustomEditorConfigurer;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.qingsp.refresh_getMergedBeanDefinition.Scanner;

/**
 * @author qingsp
 * @date 2021/5/14 16:30
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(Scanner.class);
		context.refresh();

		MutablePropertyValues pvs = new MutablePropertyValues();
		pvs.add("date", "date-new");
		RootBeanDefinition bd1 = new RootBeanDefinition(TestBean.class);
		bd1.setPropertyValues(pvs);
		context.registerBeanDefinition("tb1", bd1);

		pvs = new MutablePropertyValues();
		pvs.add("string", "string-new");
		RootBeanDefinition bd2 = new RootBeanDefinition(TestBean.class);
		bd2.setPropertyValues(pvs);
		context.registerBeanDefinition("tb2", bd2);

		TestBean tb1 = (TestBean) context.getBean("tb1");
		TestBean tb2 = (TestBean) context.getBean("tb2");
		System.out.println(tb1.getDate());
		System.out.println(tb2.getString());
	}
}
