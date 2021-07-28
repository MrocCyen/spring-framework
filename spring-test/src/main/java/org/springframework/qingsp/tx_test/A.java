package org.springframework.qingsp.tx_test;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author qingshanpeng
 * @date 2021/7/28 11:27
 * @since 标果工厂-脱骨李
 */
@Component
public class A {
	//@Transactional(rollbackFor = Exception.class)
	public void print() {
		System.out.println("this is a tx...");
	}
}
