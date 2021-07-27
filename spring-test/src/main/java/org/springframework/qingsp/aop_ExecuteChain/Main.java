package org.springframework.qingsp.aop_ExecuteChain;

/**
 * @author qingshanpeng
 * @date 2021/7/27 14:24
 * @since 标果工厂-脱骨李
 */
public class Main {
	public static void main(String[] args) {
		System.out.println(new ChainMethodInvocation().process());
	}
}
