package org.springframework.qingsp.mybatis_spring.interfaces;

import org.springframework.qingsp.mybatis_spring.annotation.Mapper;

/**
 * @author qingshanpeng
 * @date 2021/8/5 17:02
 * @since 标果工厂-脱骨李
 */
@Mapper
public class A {
	public void print(){
		System.out.println("this is a print...");
	}
}
