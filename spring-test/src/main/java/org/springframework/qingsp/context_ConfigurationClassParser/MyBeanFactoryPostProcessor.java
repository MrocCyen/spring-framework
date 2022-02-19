package org.springframework.qingsp.context_ConfigurationClassParser;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @author qingshanpeng
 * @date 2022/2/19 15:15
 * @since 标果工厂
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		GenericBeanDefinition d = (GenericBeanDefinition) beanFactory.getBeanDefinition("importD");
		d.setAutowireMode(AutowireCapableBeanFactory.AUTOWIRE_BY_NAME);
	}
}
