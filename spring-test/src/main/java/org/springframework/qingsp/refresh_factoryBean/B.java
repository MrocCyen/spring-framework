package org.springframework.qingsp.refresh_factoryBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author qingshanpeng
 * @date 2021/8/5 16:13
 * @since 标果工厂-脱骨李
 */
@Component
public class B {
	@Autowired
	A a;

	public void printA() {
		a.print();
	}
}
