package org.springframework.qingsp.tx_test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author qingsp
 * @date 2021/6/10 14:38
 * @since 标果工厂-苹果蕉
 */
@Component
@Aspect
public class AspectForA {

	@Pointcut("execution(* org.springframework.qingsp.tx_test.A.print())")
	public void pointCut012() {

	}

	@AfterReturning("pointCut012()")
	public void afterReturning(JoinPoint point) {
		System.out.println("this is a afterReturning...");
	}

	@Before("pointCut012()")
	public void before(JoinPoint point) {
		System.out.println("this is a before...");
	}

	@After("pointCut012()")
	public void after(JoinPoint point) {
		System.out.println("this is a after...");
	}

	@Around("pointCut012()")
	public Object around(ProceedingJoinPoint point) throws Throwable {
		System.out.println("this is a around...");
		return point.proceed();
	}
}
