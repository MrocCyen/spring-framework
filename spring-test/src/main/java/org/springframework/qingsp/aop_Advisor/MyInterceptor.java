package org.springframework.qingsp.aop_Advisor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @author qingsp
 * @date 2021/6/22 13:37
 * @since 标果工厂-小白杏
 */
public class MyInterceptor implements MethodInterceptor {
	@Nullable
	@Override
	public Object invoke(@NotNull MethodInvocation invocation) throws Throwable {
		System.out.println("MyInterceptor...");
		return invocation.proceed();
	}
}
