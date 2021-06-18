package org.springframework.qingsp.createBean_Aop_TargetSourceCreator;

import org.springframework.aop.TargetSource;
import org.springframework.aop.framework.autoproxy.TargetSourceCreator;
import org.springframework.aop.target.SingletonTargetSource;

/**
 * @author qingsp
 * @date 2021/6/18 15:31
 * @since 标果工厂-苹果蕉
 */
public class MyTargetSourceCreator implements TargetSourceCreator {
	@Override
	public TargetSource getTargetSource(Class<?> beanClass, String beanName) {
		if (beanClass.equals(A.class)) {
			A a = new A();
			a.setName("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

			return new SingletonTargetSource(a);
		}
		return null;
	}
}
