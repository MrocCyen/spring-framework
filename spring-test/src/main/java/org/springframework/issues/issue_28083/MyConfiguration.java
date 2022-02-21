package org.springframework.issues.issue_28083;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author qingshanpeng
 * @date 2022/2/21 10:12
 * @since 标果工厂
 */
@Configuration
public class MyConfiguration {

	@Bean(initMethod = "init")
	public MyBean myBean() {
		return new MyBean();
	}
}
