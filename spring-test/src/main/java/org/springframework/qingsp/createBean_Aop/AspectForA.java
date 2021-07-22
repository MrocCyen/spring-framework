package org.springframework.qingsp.createBean_Aop;

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

	@Pointcut("execution(* org.springframework.qingsp.createBean_Aop.A.print())" +
			"|| execution(* org.springframework.qingsp.createBean_Aop.A.print1())")
	public void pointCut() {

	}

	@AfterReturning("pointCut()")
	public void afterReturning(JoinPoint point) {
		System.out.println("this is a afterReturning...");
	}

	@Before("pointCut()")
	public void before(JoinPoint point) {
		System.out.println("this is a before...");
	}

	@After("pointCut()")
	public void after(JoinPoint point) {
		System.out.println("this is a after...");
	}

	@Around("pointCut()")
	public Object around(ProceedingJoinPoint point) throws Throwable {
		System.out.println("this is a around...");
		return point.proceed();
	}
}
