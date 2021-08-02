package org.springframework.qingsp.tx_exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

/**
 * @author qingshanpeng
 * @date 2021/7/28 11:27
 * @since 标果工厂-脱骨李
 */
@Component
public class A2 {

	@Autowired
	private B2 b2;

	/**
	 * 外层事务方法回滚的SysException异常信息和b1方法抛出的BizException异常信息不相等或者外层事务方法回滚的SysException异常信息不是b1方法抛出的BizException异常信息的父类
	 * BizException不是RuntimeException和Error的子类
	 */
	@Transactional(rollbackFor = SysException.class, propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ)
	public void print1() throws Exception {
		try {
			System.out.println("this is a tx print1...");
			b2.print1();
			b2.print2();
		} catch (Throwable ex) {
			//todo 解决异常：Transaction rolled back because it has been marked as rollback-only
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			throw ex;
		}
	}
}
