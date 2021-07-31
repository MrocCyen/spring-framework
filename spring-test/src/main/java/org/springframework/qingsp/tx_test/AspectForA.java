package org.springframework.qingsp.tx_test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationManager;

/**
 * @author qingsp
 * @date 2021/6/10 14:38
 * @since 标果工厂-苹果蕉
 */
@Component
@Aspect
public class AspectForA {

	@Pointcut("execution(* org.springframework.qingsp.tx_test.A.print1())")
	public void pointCut012() {

	}

	@Before("pointCut012()")
	public void before(JoinPoint point) {
		System.out.println("this is a before...");
//		TransactionSynchronizationManager.registerSynchronization(new TransactionSynchronization() {
//			@Override
//			public void suspend() {
//				System.out.println("this is a suspend...");
//			}
//
//			@Override
//			public void beforeCommit(boolean readOnly) {
//				System.out.println("this is a beforeCommit...");
//			}
//
//			@Override
//			public void afterCommit() {
//				System.out.println("this is a afterCommit...");
//			}
//		});
	}

	@AfterReturning("pointCut012()")
	public void afterReturning(JoinPoint point) {
		System.out.println("this is a afterReturning...");
	}

	@AfterThrowing("pointCut012()")
	public void afterThrowing(JoinPoint point) {
		System.out.println("this is a afterThrowing...");
	}
}
