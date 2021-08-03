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

	/**
	 * 事务回滚异常BizException和方法抛出的异常是一样的
	 */
	@Transactional(rollbackFor = BizException.class, propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ)
	public String print1() throws Exception {
		System.out.println("this is b tx print1...");

		throw new BizException("b tx execute failed...");
	}
}
