package org.springframework.qingsp.beans_AutowireMode;

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

	public AppleOne() {
	}

	public AppleOne(AppleTwo appleTwo) {
		this.appleTwo = appleTwo;
	}

	public AppleOne(AppleTwo appleTwo, AppleThree appleThree) {
		this.appleTwo = appleTwo;
		this.appleThree = appleThree;
	}

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
