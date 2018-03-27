package com.saggy.pizza.domain.base;

import com.saggy.pizza.domain.Base;

public class Bread extends Base {
	public Bread() {
		prize = 2.0;
	}

	@Override
	public String describe() {
		return "Adding Base : Bread";
	}
}
