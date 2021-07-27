package org.springframework.qingsp.aop_ExecuteChain;

/**
 * @author qingshanpeng
 * @date 2021/7/27 14:10
 * @since 标果工厂-脱骨李
 */
public interface MethodInterceptor {
	Object invoke(MethodInvocation methodInvocation);
}
