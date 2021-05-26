package org.springframework.qingsp.createBeanPopulateBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author qingsp
 * @date 2021/5/26 10:49
 * @since 标果工厂-玫瑰香
 */
@Component
public class A {

	@Autowired
	B b;
	public B getB() {
		return b;
	}


	C c;
	public C getC() {
		return c;
	}
	public void setC(C c) {
		this.c = c;
	}


	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
