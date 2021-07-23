package org.springframework.qingsp.aop_advice;

import org.springframework.stereotype.Component;

/**
 * @author qingshanpeng
 * @date 2021/7/23 14:02
 * @since 标果工厂-苹果芒
 */
@Component
public class B {
	public B print() {
		System.out.println("this is b for print...");
		return this;
	}

	public B print1() {
		System.out.println("this is b for print1...");
		return this;
	}
}
