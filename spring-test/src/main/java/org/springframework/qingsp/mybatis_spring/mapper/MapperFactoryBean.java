package org.springframework.qingsp.mybatis_spring.mapper;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author qingshanpeng
 * @date 2021/8/5 16:54
 * @since 标果工厂-脱骨李
 */
public class MapperFactoryBean<T> implements FactoryBean<T> {

	private final Class<T> factoryBeanClass;

	public MapperFactoryBean(Class<T> factoryBeanClass) {
		this.factoryBeanClass = factoryBeanClass;
	}

	@Override
	public T getObject() throws Exception {
		return factoryBeanClass.getDeclaredConstructor().newInstance();
	}

	@Override
	public Class<T> getObjectType() {
		return factoryBeanClass;
	}
}
