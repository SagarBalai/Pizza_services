package com.saggy.pizza.domain.base;

import com.saggy.pizza.domain.Base;

public class BaseFactory {
	public static Base newBase(String base) {
		Base base1 = null;
		if (base.equalsIgnoreCase("bread")) {
			base1 = new Bread();
		} else if (base.equalsIgnoreCase("wheat")) {
			base1 = new Wheet();
		} else {
			throw new RuntimeException(
					"Base category '"
							+ base
							+ "' is not present in store, please use available base category.");
		}
		return base1;
	}
}
