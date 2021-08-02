package org.springframework.qingsp.tx_exception;

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
	private B1 b1;

	/**
	 * 外层事务方法回滚的SysException异常信息不是b1方法抛出的BizException异常信息
	 * SysException不是RuntimeException和Error的子类
	 */
	@Transactional(rollbackFor = SysException.class, propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ)
	public void print1() throws Exception {
		System.out.println("this is a tx print1...");
		b1.print1();
	}
}
