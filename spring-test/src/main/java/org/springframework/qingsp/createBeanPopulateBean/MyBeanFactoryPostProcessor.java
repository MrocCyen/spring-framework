package org.springframework.qingsp.createBeanPopulateBean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @author qingsp
 * @date 2021/5/26 19:47
 * @since 标果工厂-玫瑰香
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		GenericBeanDefinition a = (GenericBeanDefinition) beanFactory.getBeanDefinition("a");
		a.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_BY_TYPE);
	}
}
