package org.springframework.qingsp.tx_propagation_required;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author qingshanpeng
 * @date 2021/8/3 10:08
 * @since 标果工厂-脱骨李
 */
@Component
public class A1 {
	@Autowired
	private B1 b1;

	@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ)
	public void print1() throws Exception {
		System.out.println("this is a2 tx print1...");
		b1.print1();
	}
}
