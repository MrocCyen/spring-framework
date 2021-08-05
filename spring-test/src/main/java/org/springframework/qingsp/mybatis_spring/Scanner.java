package org.springframework.qingsp.mybatis_spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.qingsp.mybatis_spring.annotation.Mapper;
import org.springframework.qingsp.mybatis_spring.annotation.MapperScan;

/**
 * @author qingshanpeng
 * @date 2021/8/5 16:19
 * @since 标果工厂-脱骨李
 */
@ComponentScan("org.springframework.qingsp.mybatis_spring")
@MapperScan(basePackage = "org.springframework.qingsp.mybatis_spring.interfaces", annotation = Mapper.class)
public class Scanner {
}
