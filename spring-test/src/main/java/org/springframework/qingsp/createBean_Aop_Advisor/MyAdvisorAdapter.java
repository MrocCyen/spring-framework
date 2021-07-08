package org.springframework.qingsp.createBean_Aop_Advisor;

import org.aopalliance.aop.Advice;
import org.aopalliance.intercept.MethodInterceptor;
import org.springframework.aop.Advisor;
import org.springframework.aop.framework.adapter.AdvisorAdapter;
import org.springframework.stereotype.Component;

/**
 * @author qingsp
 * @date 2021/6/22 11:56
 * @since 标果工厂-小白杏
 */
@Component
public class MyAdvisorAdapter implements AdvisorAdapter {
	@Override
	public boolean supportsAdvice(Advice advice) {
		if (advice instanceof MyAdvice) {
			return true;
		}
		return false;
	}

	@Override
	public MethodInterceptor getInterceptor(Advisor advisor) {
		return new MyInterceptor();
	}
}
