package org.springframework.qingsp.aop_Advisor;

import org.springframework.aop.framework.adapter.AdvisorAdapterRegistrationManager;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author qingsp
 * @date 2021/6/10 17:53
 * @since 标果工厂-苹果蕉
 */
@Component
public class Config {
	@Bean
	public AdvisorAdapterRegistrationManager advisorAdapterRegistrationManager() {
		return new AdvisorAdapterRegistrationManager();
	}
}
