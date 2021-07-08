package org.springframework.qingsp.createBean_Aop_Advisor;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author qingsp
 * @date 2021/6/10 14:38
 * @since 标果工厂-苹果蕉
 */
@Component
@Aspect
public class AspectForA {

	@Pointcut("execution(* org.springframework.qingsp.createBean_Aop_Advisor.A.*()))")
	public void pointCut() {

	}

	@Before("pointCut()")
	public void before(JoinPoint point) {
		System.out.println("this is a before...");
	}
}
