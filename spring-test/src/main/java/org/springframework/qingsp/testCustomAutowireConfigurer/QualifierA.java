package org.springframework.qingsp.testCustomAutowireConfigurer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author qingsp
 * @version 0.0.1
 * @date 2021-05-19
 */
@Component
@MyQualifier("QualifierA-1")
public class QualifierA {
	@MyQualifier("QualifierB-1")
	@Autowired
	private QualifierB qualifierB;

	public void print() {
		System.out.println(qualifierB);
	}
}
