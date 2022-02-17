package org.springframework.qingsp.beans_scope;

import org.springframework.context.annotation.Scope;

import java.lang.annotation.*;

/**
 * @author qingshanpeng
 * @date 2022/2/17 15:15
 * @since 标果工厂
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Scope("myScopeHandler")
public @interface MyScope {
}
