package org.springframework.qingsp.beans_Role;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @author qingshanpeng
 * @date 2022/2/19 15:15
 * @since 标果工厂
 */
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
//		BeanDefinitionRegistry registry = (BeanDefinitionRegistry) beanFactory;
//		GenericBeanDefinition d = new GenericBeanDefinition();
//		d.setBeanClass(ConfigurationBean11.class);
//		registry.registerBeanDefinition("configurationBean1", d);
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {

	}
}
