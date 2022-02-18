package org.springframework.qingsp.beans_AutowireMode;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @author qingshanpeng
 * @date 2022/2/17 15:35
 * @since 标果工厂
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		GenericBeanDefinition beanDefinition1 = (GenericBeanDefinition) beanFactory.getBeanDefinition("foodOne");
		beanDefinition1.setAutowireMode(AutowireCapableBeanFactory.AUTOWIRE_BY_TYPE);

//		GenericBeanDefinition beanDefinition2 = (GenericBeanDefinition) beanFactory.getBeanDefinition("appleOne");
//		beanDefinition2.setAutowireMode(AutowireCapableBeanFactory.AUTOWIRE_CONSTRUCTOR);
	}
}
