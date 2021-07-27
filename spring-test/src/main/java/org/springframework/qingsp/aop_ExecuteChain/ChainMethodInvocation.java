package org.springframework.qingsp.aop_ExecuteChain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qingshanpeng
 * @date 2021/7/27 14:14
 * @since 标果工厂-脱骨李
 */
public class ChainMethodInvocation implements MethodInvocation {

	private final List<MethodInterceptor> methodInterceptors = new ArrayList<>();

	{
		methodInterceptors.add(new AroundMethodInterceptor());
		methodInterceptors.add(new BeforeMethodInterceptor());
		methodInterceptors.add(new AfterMethodInterceptor());
		methodInterceptors.add(new AfterReturningMethodInterceptor());
	}

	private Integer currentIndex = -1;

	@Override
	public Object process() {
		if (currentIndex == methodInterceptors.size() - 1) {
			System.out.println("origin...");
			return new A();
		}
		MethodInterceptor interceptor = methodInterceptors.get(++currentIndex);
		return interceptor.invoke(this);
	}
}