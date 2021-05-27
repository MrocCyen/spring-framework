package org.springframework.qingsp.createBean_PopulateBean;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author qingsp
 * @date 2021/5/26 14:18
 * @since 标果工厂-玫瑰香
 */
@Component
public class MyInstantiationAwareBeanPostProcessor implements SmartInstantiationAwareBeanPostProcessor {
	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		return null;
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		if (beanName.equals("a")) {
			((A) bean).setName("this is a");
		}
		return true;
	}

	@Override
	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
		return pvs;
	}
}
