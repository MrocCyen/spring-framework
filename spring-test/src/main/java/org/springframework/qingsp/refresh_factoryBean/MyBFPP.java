package org.springframework.qingsp.refresh_factoryBean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @author qingshanpeng
 * @date 2021/8/5 15:52
 * @since 标果工厂-脱骨李
 */
@Component
public class MyBFPP implements BeanDefinitionRegistryPostProcessor {
	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		GenericBeanDefinition bd = new GenericBeanDefinition();
		bd.setBeanClass(FactoryBeanForA.class);
		bd.getConstructorArgumentValues().addGenericArgumentValue(new A());

		registry.registerBeanDefinition("factoryBeanForA", bd);
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

	}
}
