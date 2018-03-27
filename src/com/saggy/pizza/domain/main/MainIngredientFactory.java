package com.saggy.pizza.domain.main;

import com.saggy.pizza.domain.Main;

public class MainIngredientFactory {
	public static Main newMainIngredient(String str) {
		Main main1 = null;
		if (str.equalsIgnoreCase("chicken")) {
			main1 = new Chicken();
		} else if (str.equalsIgnoreCase("paneer")) {
			main1 = new Paneer();
		} else {
			throw new RuntimeException(
					"Main category is not present, please enter correct main category.");
		}
		return main1;
	}
}
