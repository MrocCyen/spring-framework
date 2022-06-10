package org.springframework.qingsp.tx_exception;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author qingsp
 * @date 2021/5/14 16:32
 */
@ComponentScan("org.springframework.qingsp.tx_exception")
@EnableTransactionManagement(proxyTargetClass = true)
@EnableAspectJAutoProxy(exposeProxy = true)
public class Scanner {
}