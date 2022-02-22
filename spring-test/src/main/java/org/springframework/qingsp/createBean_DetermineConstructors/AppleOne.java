package org.springframework.qingsp.createBean_DetermineConstructors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author qingshanpeng
 * @date 2022/2/18 11:22
 * @since 标果工厂
 */
@Component
public class AppleOne {
	private AppleTwo3 appleTwo;
	private AppleThree1 appleThree;
	private AppleFour1 appleFour;

	@Autowired(required = false)
	public AppleOne(AppleTwo appleTwo) {
		this.appleTwo = appleTwo;
	}

//	@Autowired(required = false)
//	public AppleOne(AppleTwo3 appleTwo, AppleFour1 appleFour) {
//		this.appleTwo = appleTwo;
//		this.appleFour = appleFour;
//	}

	@Autowired(required = false)
	public AppleOne(AppleTwo2 appleTwo, AppleThree appleThree) {
		this.appleTwo = appleTwo;
		this.appleThree = appleThree;
	}

	@Autowired(required = false)
	public AppleOne(AppleThree1 appleThree, AppleFour1 appleFour) {
		this.appleThree = appleThree;
		this.appleFour = appleFour;
	}

	public AppleTwo3 getAppleTwo() {
		return appleTwo;
	}

	public AppleThree1 getAppleThree() {
		return appleThree;
	}

	public AppleFour1 getAppleFour() {
		return appleFour;
	}
}
