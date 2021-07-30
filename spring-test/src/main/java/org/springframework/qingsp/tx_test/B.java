package org.springframework.qingsp.tx_test;

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
public class B {
	@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ)
	public void print1() throws Exception {
		System.out.println("this is b tx print1...");
	}

	@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ)
	public void print2() throws Exception {
		System.out.println("this is b tx print2...");
	}

	@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ)
	public void print3() throws Exception {
		System.out.println("this is b tx print3...");
	}

	@Transactional(rollbackFor = Exception.class, propagation = Propagation.MANDATORY, isolation = Isolation.REPEATABLE_READ)
	public void print4() throws Exception {
		System.out.println("this is b tx print4...");
	}

	@Transactional(rollbackFor = Exception.class, propagation = Propagation.NEVER, isolation = Isolation.REPEATABLE_READ)
	public void print5() throws Exception {
		System.out.println("this is b tx print5...");
	}
}
