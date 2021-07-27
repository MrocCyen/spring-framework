package org.springframework.qingsp.aop_ExecuteChain;

/**
 * @author qingshanpeng
 * @date 2021/7/27 14:11
 * @since 标果工厂-脱骨李
 */
public class AfterReturningMethodInterceptor implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation methodInvocation) {
		Object process = methodInvocation.process();
		System.out.println("afterReturning...");
		return process;
	}
}
