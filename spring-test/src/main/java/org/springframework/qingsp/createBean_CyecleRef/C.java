package org.springframework.qingsp.createBean_CyecleRef;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author qingsp
 * @date 2021/6/8 17:30
 * @since 标果工厂-苹果蕉
 */
@Component
public class C {
	@Autowired
	B b;
}
