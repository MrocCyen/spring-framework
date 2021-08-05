package org.springframework.qingsp.mybatis_spring.scan;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.qingsp.mybatis_spring.mapper.MapperFactoryBean;

import java.util.Set;

/**
 * @author qingshanpeng
 * @date 2021/8/5 16:46
 * @since 标果工厂-脱骨李
 */
public class ClassPathMapperScanner extends ClassPathBeanDefinitionScanner {

	public ClassPathMapperScanner(BeanDefinitionRegistry registry) {
		super(registry);
	}

	@NotNull
	@Override
	public Set<BeanDefinitionHolder> doScan(@NotNull String... basePackages) {
		Set<BeanDefinitionHolder> beanDefinitionHolders = super.doScan(basePackages);
		for (BeanDefinitionHolder beanDefinitionHolder : beanDefinitionHolders) {
			BeanDefinition beanDefinition = beanDefinitionHolder.getBeanDefinition();
			GenericBeanDefinition genericBeanDefinition = (GenericBeanDefinition) beanDefinition;

			genericBeanDefinition.getConstructorArgumentValues().addGenericArgumentValue(genericBeanDefinition.getBeanClassName());
			genericBeanDefinition.setBeanClass(MapperFactoryBean.class);
		}

		return beanDefinitionHolders;
	}

}
