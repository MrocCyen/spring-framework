package org.springframework.qingsp.aop_ExecuteChain;

/**
 * @author qingshanpeng
 * @date 2021/7/27 14:11
 * @since 标果工厂-脱骨李
 */
public class AroundMethodInterceptor implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation methodInvocation) {
		System.out.println("around...");
		return methodInvocation.process();
	}
}
