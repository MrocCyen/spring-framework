package org.springframework.qingsp.refresh_factoryBean;

/**
 * @author qingshanpeng
 * @date 2021/8/5 15:15
 * @since 标果工厂-脱骨李
 */
public class A {

	private String name;

	public void print() {
		System.out.println("this is a print...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
