package org.springframework.qingsp.createBean_Aop_TargetSourceCreator;

import org.springframework.stereotype.Component;

/**
 * @author qingsp
 * @date 2021/6/18 15:45
 * @since 标果工厂-苹果蕉
 */
@Component
public class A {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
