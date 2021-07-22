package org.springframework.qingsp.aop_ProxyCallbackFilter;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author qingsp
 * @date 2021/5/14 16:32
 */
@ComponentScan("org.springframework.qingsp.aop_ProxyCallbackFilter")
@EnableAspectJAutoProxy(exposeProxy = true)
public class Scanner {
}
