package org.springframework.qingsp.test_CustomEditorConfigurer;

import java.beans.PropertyEditorSupport;

/**
 * @author qingsp
 * @version 0.0.1
 * @date 2021-05-19
 */
public class PropertyEditorDate extends PropertyEditorSupport {
	@Override
	public void setValue(Object value) {
		super.setValue(value);
	}

	@Override
	public Object getValue() {
		return super.getValue();
	}

	@Override
	public String getAsText() {
		return null;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {

	}
}
