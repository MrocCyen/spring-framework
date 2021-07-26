package org.springframework.qingsp.refresh_CustomEditorConfigurer;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

/**
 * @author qingsp
 * @version 0.0.1
 * @date 2021-05-19
 */
public class PropertyEditorRegistrarString implements PropertyEditorRegistrar {
	@Override
	public void registerCustomEditors(PropertyEditorRegistry registry) {
		registry.registerCustomEditor(PropertyEditorString.class, new PropertyEditorString());
	}
}
