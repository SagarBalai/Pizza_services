package com.saggy.pizza.services;

import java.util.Set;

import com.saggy.pizza.PizzaServices;
import com.saggy.pizza.domain.Pizza;
import com.saggy.pizza.services.impl.PizzaBuilder;
import com.saggy.pizza.services.impl.PizzaPrizeCalculator;

public class PizzaServicesImpl implements PizzaServices {

	PizzaBuilder pizzaBuilder = new PizzaBuilder();
	PizzaPrizeCalculator prizeCal = new PizzaPrizeCalculator();

	@Override
	public Pizza createPizza(String base, String main, Set<String> toppins) {
		return pizzaBuilder.build(base, main, toppins);
	}

	@Override
	public double calcualtePrize(Pizza pizza) {
		return prizeCal.calcualtePrize(pizza);
	}
}
