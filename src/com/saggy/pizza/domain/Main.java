package com.saggy.pizza.domain;

public abstract class Main implements Ingredient {
	protected double prize;

	@Override
	public double calculatePrize() {
		return prize;
	}

}
