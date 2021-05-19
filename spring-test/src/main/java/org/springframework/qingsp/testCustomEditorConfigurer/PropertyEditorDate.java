package org.springframework.qingsp.testCustomEditorConfigurer;

import java.beans.PropertyEditorSupport;

/**
 * @author qingsp
 * @version 0.0.1
 * @date 2021-05-19
 */
public class PropertyEditorDate extends PropertyEditorSupport {
	@Override
	public String getAsText() {
		return null;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {

	}
}
