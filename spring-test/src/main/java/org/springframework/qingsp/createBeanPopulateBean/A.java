package org.springframework.qingsp.createBeanPopulateBean;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.ObjectProvider;
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
	E e;
	public E getE() {
		return e;
	}

	B b;
	D d;
	private ObjectFactory<MyObjectFactoryClass> myObjectFactory;
	private ObjectProvider<MyObjectProviderClass> myObjectProvider;

	@Autowired
	public void setAll(B b,
	                   D d,
	                   ObjectFactory<MyObjectFactoryClass> myObjectFactory,
	                   ObjectProvider<MyObjectProviderClass> myObjectProvider) {
		this.b = b;
		this.d = d;
		this.myObjectFactory = myObjectFactory;
		this.myObjectProvider = myObjectProvider;
	}
	public B getB() {
		return b;
	}
	public D getD() {
		return d;
	}
	public ObjectFactory<MyObjectFactoryClass> getMyObjectFactory() {
		return myObjectFactory;
	}
	public ObjectProvider<MyObjectProviderClass> getMyObjectProvider() {
		return myObjectProvider;
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
