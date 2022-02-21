package org.springframework.issues.issue_28083;

import javax.annotation.PostConstruct;

/**
 * @author qingshanpeng
 * @date 2022/2/21 10:07
 * @since 标果工厂
 */
public class MyBean {
	@PostConstruct
	public void init() {
		System.out.println("11111111111111111111111");
	}
}
