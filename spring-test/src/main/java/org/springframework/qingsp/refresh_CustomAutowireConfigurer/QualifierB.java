package org.springframework.qingsp.refresh_CustomAutowireConfigurer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author qingsp
 * @version 0.0.1
 * @date 2021-05-19
 */
@Component
@MyQualifier("QualifierB-1")
public class QualifierB {

	@MyQualifier("QualifierA-1")
	@Autowired
	private QualifierA qualifierA;

	public void print() {
		System.out.println(qualifierA);
	}

	public QualifierA getQualifierA() {
		return qualifierA;
	}
}
