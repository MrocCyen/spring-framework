package org.springframework.qingsp.aop_advice;

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

	@Pointcut("execution(* org.springframework.qingsp.aop_advice.A.print())" +
			"|| execution(* org.springframework.qingsp.aop_advice.A.print1())")
	public void pointCut012() {

	}

	@Pointcut("execution(* org.springframework.qingsp.aop_advice.A.print3(..))")
	public void pointCut3() {

	}

	@Pointcut("execution(* org.springframework.qingsp.aop_advice.A.print4(..))")
	public void pointCut4() {

	}

	@AfterReturning("pointCut012()")
	public void afterReturning(JoinPoint point) {
		System.out.println("this is a afterReturning...");
	}

	@AfterReturning("pointCut012()")
	public void afterReturning1(JoinPoint point) {
		System.out.println("this is a afterReturning1...");
	}

	@Before("pointCut012()")
	public void before(JoinPoint point) {
		System.out.println("this is a before...");
	}

	@After("pointCut012()")
	public void after(JoinPoint point) {
		System.out.println("this is a after...");
	}

	@After("pointCut012()")
	public void after1(JoinPoint point) {
		System.out.println("this is a after1...");
	}

	@Around("pointCut012()")
	public Object around(ProceedingJoinPoint point) throws Throwable {
		System.out.println("this is a around...");
		return point.proceed();
	}

	@Around("pointCut012()")
	public Object around1(ProceedingJoinPoint point) throws Throwable {
		System.out.println("this is a around1...");
		return point.proceed();
	}

	@AfterThrowing("pointCut012()")
	public void afterThrowing(JoinPoint point) {
		System.out.println("this is a afterThrowing...");
	}

	@Around("pointCut3() && args(name)")
	public Object around3(ProceedingJoinPoint point, String name) throws Throwable {
		System.out.println("this is a around...");
		System.out.println("this is a around, " + name);
		return point.proceed();
	}

	@Around(value = "pointCut4() && args(name,age)", argNames = "point,name,age")
	public Object around4(ProceedingJoinPoint point, String name, Integer age) throws Throwable {
		System.out.println("this is a around...");
		System.out.println("this is a around, " + name);
		System.out.println("this is a around, " + age);
		return point.proceed();
	}

	@AfterReturning(value = "pointCut4() && args(name,age)", argNames = "point,name,age,returnValue", returning = "returnValue")
	public void afterReturning4(JoinPoint point, String name, Integer age, Object returnValue) throws Throwable {
		System.out.println("this is a afterReturning...");
		System.out.println("this is a afterReturning, " + name);
		System.out.println("this is a afterReturning, " + age);
		System.out.println("this is a afterReturning, " + returnValue);
	}
}
