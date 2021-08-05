package org.springframework.qingsp.mybatis_spring.annotation;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author qingshanpeng
 * @date 2021/8/5 16:18
 * @since 标果工厂-脱骨李
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(MapperScanRegister.class)
public @interface MapperScan {

	String basePackage() default "";

	Class<? extends Annotation> annotation() default Annotation.class;

}
