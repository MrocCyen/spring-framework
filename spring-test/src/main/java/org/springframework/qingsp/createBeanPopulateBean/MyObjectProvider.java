package org.springframework.qingsp.createBeanPopulateBean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;

/**
 * @author qingsp
 * @date 2021/5/26 19:18
 * @since 标果工厂-玫瑰香
 */
@Component
public class MyObjectProvider implements ObjectProvider<MyObjectProviderClass> {
	@Override
	public MyObjectProviderClass getObject() throws BeansException {
		return new MyObjectProviderClass();
	}

	@Override
	public MyObjectProviderClass getObject(Object... args) throws BeansException {
		return new MyObjectProviderClass();
	}

	@Override
	public MyObjectProviderClass getIfAvailable() throws BeansException {
		return new MyObjectProviderClass();
	}

	@Override
	public MyObjectProviderClass getIfUnique() throws BeansException {
		return new MyObjectProviderClass();
	}
}
