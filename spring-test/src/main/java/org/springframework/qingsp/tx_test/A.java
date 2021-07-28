package org.springframework.qingsp.tx_test;

import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author qingshanpeng
 * @date 2021/7/28 11:27
 * @since 标果工厂-脱骨李
 */
@Component
public class A {

	@Autowired
	private B b;

	@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ)
	public void print1() throws Exception {
		System.out.println("this is a tx print1...");
		((A) AopContext.currentProxy()).print2();
		b.print1();
	}

	@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ)
	public void print2() throws Exception {
		System.out.println("this is a tx print2...");
	}

	@Transactional(rollbackFor = Exception.class, propagation = Propagation.MANDATORY, isolation = Isolation.REPEATABLE_READ)
	public void print3() throws Exception {
		throw new Exception();
	}
}
