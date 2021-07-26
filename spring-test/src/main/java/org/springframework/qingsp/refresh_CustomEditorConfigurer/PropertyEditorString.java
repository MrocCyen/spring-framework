package org.springframework.qingsp.refresh_CustomEditorConfigurer;

import java.beans.PropertyEditorSupport;

/**
 * @author qingsp
 * @version 0.0.1
 * @date 2021-05-19
 */
public class PropertyEditorString extends PropertyEditorSupport {
	@Override
	public void setValue(Object value) {
		super.setValue(value + "2021");
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
