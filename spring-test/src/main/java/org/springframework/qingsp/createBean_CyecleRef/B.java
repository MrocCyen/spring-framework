package org.springframework.qingsp.createBean_CyecleRef;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author qingsp
 * @date 2021/5/26 10:49
 * @since 标果工厂-玫瑰香
 */
@Component
public class B {
	@Autowired
	A a;
}
