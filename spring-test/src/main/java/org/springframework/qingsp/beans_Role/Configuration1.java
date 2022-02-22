package org.springframework.qingsp.beans_Role;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author qingshanpeng
 * @date 2022/2/21 15:51
 * @since 标果工厂
 */
@Configuration
public class Configuration1 {

	@Bean("configurationBean1")
	public ConfigurationBean1 configurationBean1() {
		ConfigurationBean1 role = new ConfigurationBean1();
		role.setName("configurationBean1");
		return role;
	}

	@Bean("configurationBean2")
	public ConfigurationBean1 configurationBean2() {
		ConfigurationBean1 role = new ConfigurationBean1();
		role.setName("configurationBean2");
		return role;
	}
}
