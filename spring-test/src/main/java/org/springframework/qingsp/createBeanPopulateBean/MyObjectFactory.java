package org.springframework.qingsp.createBeanPopulateBean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.stereotype.Component;

/**
 * @author qingsp
 * @date 2021/5/26 19:17
 * @since 标果工厂-玫瑰香
 */
@Component
public class MyObjectFactory implements ObjectFactory<MyObjectFactoryClass> {
	@Override
	public MyObjectFactoryClass getObject() throws BeansException {
		return new MyObjectFactoryClass();
	}
}
