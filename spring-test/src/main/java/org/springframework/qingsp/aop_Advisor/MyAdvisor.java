package org.springframework.qingsp.aop_Advisor;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Advisor;

/**
 * @author qingshanpeng
 * @date 2021/7/8 14:43
 * @since 标果工厂-小白杏
 */
public class MyAdvisor implements Advisor {
	@Override
	public Advice getAdvice() {
		return new MyAdvice();
	}

	@Override
	public boolean isPerInstance() {
		return true;
	}
}