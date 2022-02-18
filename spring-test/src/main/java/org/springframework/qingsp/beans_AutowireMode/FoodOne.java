package org.springframework.qingsp.beans_AutowireMode;

import org.springframework.stereotype.Component;

/**
 * @author qingshanpeng
 * @date 2022/2/18 9:56
 * @since 标果工厂
 */
@Component
public class FoodOne {

	private FoodTwo foodTwo;
	private FoodThree foodThree;


//	public void setFoodTwo(FoodTwo foodTwo) {
//		this.foodTwo = foodTwo;
//	}

	public void setFoodTwo1(FoodTwo foodTwo) {
		this.foodTwo = foodTwo;
	}

//	public void setFoodTwoThree(FoodTwo foodTwo, FoodThree foodThree) {
//		this.foodTwo = foodTwo;
//		this.foodThree = foodThree;
//	}

//	public void setFoodThree(FoodThree foodThree) {
//		this.foodThree = foodThree;
//	}

	public FoodTwo getFoodTwo() {
		return foodTwo;
	}

	public FoodThree getFoodThree() {
		return foodThree;
	}
}
