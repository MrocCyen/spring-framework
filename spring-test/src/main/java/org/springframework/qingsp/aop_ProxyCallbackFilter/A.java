package org.springframework.qingsp.aop_ProxyCallbackFilter;

import org.springframework.aop.framework.AdvisedSupport;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author qingsp
 * @date 2021/6/10 14:37
 * @since 标果工厂-苹果蕉
 */
@Component
public class A extends AdvisedSupport implements Serializable {

	/**
	 * use serialVersionUID from Spring 2.0 for interoperability.
	 */
	private static final long serialVersionUID = 2651364800145442165L;

	public A print() {
		System.out.println("this is a for print...");
		return this;
	}

	public A print1() {
		System.out.println("this is a for print1...");
		return this;
	}
}
