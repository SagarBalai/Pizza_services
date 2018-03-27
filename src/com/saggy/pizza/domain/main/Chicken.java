package com.saggy.pizza.domain.main;

import com.saggy.pizza.domain.Main;

public class Chicken extends Main {
	public Chicken() {
		prize = 7.0;
	}

	@Override
	public String describe() {
		return "Adding Main ingredient : Chicken";
	}

}
