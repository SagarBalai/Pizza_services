package com.saggy.pizza.services.impl;

import com.saggy.pizza.domain.Pizza;

public class PizzaPrizeCalculator {
	public double calcualtePrize(Pizza pizza) {
		return pizza.calculatePrize();
	}
}
