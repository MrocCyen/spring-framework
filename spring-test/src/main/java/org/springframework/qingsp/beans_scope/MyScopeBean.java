package org.springframework.qingsp.beans_scope;

import org.springframework.stereotype.Component;

/**
 * @author qingshanpeng
 * @date 2022/2/17 15:17
 * @since 标果工厂
 */
@Component
@MyScope
public class MyScopeBean {
	public void print() {
		System.out.println(this.getClass());
	}
}
