package org.springframework.qingsp.mybatis_spring.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author qingshanpeng
 * @date 2021/8/5 17:30
 * @since 标果工厂-脱骨李
 */
@Component
public class D {

	@Autowired
	A a;

	public void printA() {
		a.print();
	}
}
