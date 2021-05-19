package org.springframework.qingsp.testCustomEditorConfigurer;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author qingsp
 * @version 0.0.1
 * @date 2021-05-19
 */
@Component
public class CustomEditorConfigurerConfig {
	@Bean
	public CustomEditorConfigurer customEditorConfigurer() {
		CustomEditorConfigurer configurer = new CustomEditorConfigurer();
		configurer.setPropertyEditorRegistrars(new PropertyEditorRegistrar[]{new PropertyEditorRegistrarDate(), new PropertyEditorRegistrarString()});

		return configurer;
	}
}
