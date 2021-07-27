package org.springframework.qingsp.tx_test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author qingsp
 * @date 2021/5/14 16:32
 */
@ComponentScan("org.springframework.qingsp.tx_test")
@EnableTransactionManagement(proxyTargetClass = true)
@EnableAspectJAutoProxy(exposeProxy = true)
public class Scanner {
}
