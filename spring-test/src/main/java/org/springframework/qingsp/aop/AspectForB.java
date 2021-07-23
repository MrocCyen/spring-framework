package org.springframework.qingsp.aop;

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
public class AspectForB {

	@Pointcut("execution(* org.springframework.qingsp.aop.B.print())")
	public void pointCut() {

	}

	@AfterReturning("pointCut()")
	public void afterReturning(JoinPoint point) {
		System.out.println("this is b afterReturning...");
	}

	@Before("pointCut()")
	public void before(JoinPoint point) {
		System.out.println("this is b before...");
	}

	@After("pointCut()")
	public void after(JoinPoint point) {
		System.out.println("this is b after...");
	}

	@Around("pointCut()")
	public Object around(ProceedingJoinPoint point) throws Throwable {
		System.out.println("this is b around...");
		return point.proceed();
	}
}
