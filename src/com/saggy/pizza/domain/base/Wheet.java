package com.saggy.pizza.domain.base;

import com.saggy.pizza.domain.Base;

public class Wheet extends Base {
	public Wheet() {
		prize = 3.5;
	}

	@Override
	public String describe() {
		return "Adding Base : Wheet Bread";
	}
}
