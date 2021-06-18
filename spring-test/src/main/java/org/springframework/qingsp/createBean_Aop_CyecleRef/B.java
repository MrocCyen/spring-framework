package org.springframework.qingsp.createBean_Aop_CyecleRef;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author qingsp
 * @date 2021/6/18 10:51
 * @since 标果工厂-苹果蕉
 */
@Component
public class B {
	@Autowired
	A a;
}
