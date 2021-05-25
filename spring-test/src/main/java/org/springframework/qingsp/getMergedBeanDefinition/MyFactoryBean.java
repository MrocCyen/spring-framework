package org.springframework.qingsp.getMergedBeanDefinition;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author qingsp
 * @date 2021/5/25 15:16
 * @since 标果工厂-玫瑰香
 */
@Component
public class MyFactoryBean implements FactoryBean<A> {
	@Override
	public A getObject() throws Exception {
		return new A();
	}

	@Override
	public Class<?> getObjectType() {
		return A.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
