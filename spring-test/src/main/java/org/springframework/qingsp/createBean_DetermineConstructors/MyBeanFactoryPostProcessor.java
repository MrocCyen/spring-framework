package org.springframework.qingsp.createBean_DetermineConstructors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
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
		GenericBeanDefinition beanDefinition = (GenericBeanDefinition) beanFactory.getBeanDefinition("appleOne");
		beanDefinition.setAutowireMode(AutowireCapableBeanFactory.AUTOWIRE_CONSTRUCTOR);
//		ConstructorArgumentValues constructorArgumentValues = new ConstructorArgumentValues();
//		AppleTwo appleTwo = new AppleTwo();
//		AppleThree appleThree = new AppleThree();
//		AppleFour appleFour = new AppleFour();
//		constructorArgumentValues.addIndexedArgumentValue(0, appleTwo);
//		constructorArgumentValues.addIndexedArgumentValue(1, appleThree);
//		constructorArgumentValues.addIndexedArgumentValue(2, appleFour);
//		System.out.println("BeanFactoryPostProcessor:" + appleTwo);
//		System.out.println("BeanFactoryPostProcessor:" + appleThree);
//		System.out.println("BeanFactoryPostProcessor:" + appleFour);
//		beanDefinition.setConstructorArgumentValues(constructorArgumentValues);
		beanDefinition.setLenientConstructorResolution(false);
	}
}
