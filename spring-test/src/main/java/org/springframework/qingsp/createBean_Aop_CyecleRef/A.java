package org.springframework.qingsp.createBean_Aop_CyecleRef;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author qingsp
 * @date 2021/6/10 14:37
 * @since 标果工厂-苹果蕉
 */
@Component
public class A {

	@Autowired
	B b;

	public void print() {
		System.out.println("this is a for jdk...");
	}
}
