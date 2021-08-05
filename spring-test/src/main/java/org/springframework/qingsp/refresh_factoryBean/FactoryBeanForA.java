package org.springframework.qingsp.refresh_factoryBean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author qingshanpeng
 * @date 2021/8/5 15:08
 * @since 标果工厂-脱骨李
 */
public class FactoryBeanForA implements FactoryBean<A> {

	private A a;

	public FactoryBeanForA(A a) {
		this.a = a;
	}

	@Override
	public A getObject() throws Exception {
		return a;
	}

	@Override
	public Class<?> getObjectType() {
		return a.getClass();
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
