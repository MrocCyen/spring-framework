package org.springframework.qingsp.refresh_CustomAutowireConfigurer;

import org.springframework.beans.factory.annotation.CustomAutowireConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

/**
 * @author qingsp
 * @version 0.0.1
 * @date 2021-05-19
 */
@Component
public class CustomAutowireConfigurerConfig {
	@Bean
	public CustomAutowireConfigurer customAutowireConfigurer() {
		CustomAutowireConfigurer configurer = new CustomAutowireConfigurer();
		Set<Class<?>> set = new HashSet<>();
		set.add(MyQualifier.class);
		configurer.setCustomQualifierTypes(set);

		return configurer;
	}
}
