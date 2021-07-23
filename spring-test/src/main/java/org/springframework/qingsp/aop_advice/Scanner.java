package org.springframework.qingsp.aop_advice;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author qingsp
 * @date 2021/5/14 16:32
 */
@ComponentScan("org.springframework.qingsp.aop_advice")
@EnableAspectJAutoProxy(exposeProxy = true)
public class Scanner {
}
