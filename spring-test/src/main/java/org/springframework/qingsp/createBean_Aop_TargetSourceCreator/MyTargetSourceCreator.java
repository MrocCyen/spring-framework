package org.springframework.qingsp.createBean_Aop_TargetSourceCreator;

import org.springframework.aop.TargetSource;
import org.springframework.aop.framework.autoproxy.TargetSourceCreator;

/**
 * @author qingsp
 * @date 2021/6/18 15:31
 * @since 标果工厂-苹果蕉
 */
public class MyTargetSourceCreator implements TargetSourceCreator {
	@Override
	public TargetSource getTargetSource(Class<?> beanClass, String beanName) {
		return null;
	}
}
