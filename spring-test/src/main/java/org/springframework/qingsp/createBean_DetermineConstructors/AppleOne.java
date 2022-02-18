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
	private AppleTwo appleTwo;
	private AppleThree appleThree;
	private AppleFour appleFour;

	@Autowired(required = false)
	public AppleOne(AppleTwo appleTwo) {
		this.appleTwo = appleTwo;
	}

	@Autowired(required = false)
	public AppleOne(AppleTwo appleTwo, AppleThree appleThree) {
		this.appleTwo = appleTwo;
		this.appleThree = appleThree;
	}

	@Autowired(required = false)
	public AppleOne(AppleTwo appleTwo, AppleThree appleThree, AppleFour appleFour) {
		this.appleTwo = appleTwo;
		this.appleThree = appleThree;
		this.appleFour = appleFour;
	}

	public AppleTwo getAppleTwo() {
		return appleTwo;
	}

	public AppleThree getAppleThree() {
		return appleThree;
	}

	public AppleFour getAppleFour() {
		return appleFour;
	}
}
