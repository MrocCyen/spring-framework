package org.springframework.qingsp.beans_Role;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author qingshanpeng
 * @date 2022/2/21 15:51
 * @since 标果工厂
 */
@Configuration("applicationConfigurationClassRole1")
//@Configuration
public class ApplicationConfiguration1 {

	@Bean("applicationConfigurationClassRole1")
	public ApplicationConfigurationClassRole1 applicationConfigurationClassRole1() {
		ApplicationConfigurationClassRole1 role = new ApplicationConfigurationClassRole1();
		role.setName("applicationConfigurationClassRole1");
		return role;
	}

	@Bean("applicationConfigurationClassRole2")
	public ApplicationConfigurationClassRole1 applicationConfigurationClassRole2() {
		ApplicationConfigurationClassRole1 role = new ApplicationConfigurationClassRole1();
		role.setName("applicationConfigurationClassRole2");
		return role;
	}
}
