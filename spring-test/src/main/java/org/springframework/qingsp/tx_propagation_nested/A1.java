package org.springframework.qingsp.tx_propagation_nested;

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
public class A1 {

	@Autowired
	private B b;

	/**
	 * b.print3()为内嵌事务，抛出异常，b.print3()会回滚到保存点的位置；
	 * 外层事务有异常捕获，所以不会回滚保存点之前操作；
	 * 然后外层事务走事务提交过程；
	 * 最终整个事务提交；
	 * 注意：这里事务提交的数据是在b.print3()创建的保存点之前的操作，也就是b.print1()和b.print2()中的操作
	 */
	@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ)
	public void print1() throws Exception {
		try {
			System.out.println("this is a tx print1...");
			b.print1();
			b.print2();
			b.print3();
			b.print4();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
