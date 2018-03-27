package com.saggy.pizza.services.impl;

import java.util.HashSet;
import java.util.Set;

import com.saggy.pizza.domain.Base;
import com.saggy.pizza.domain.Main;
import com.saggy.pizza.domain.Pizza;
import com.saggy.pizza.domain.Toppin;
import com.saggy.pizza.domain.base.BaseFactory;
import com.saggy.pizza.domain.main.MainIngredientFactory;
import com.saggy.pizza.domain.toppins.ToppinFactory;

public class PizzaBuilder {

	public Pizza build(String base, String main, Set<String> toppins) {
		// add some validation on all categories and use user defined exception
		// for more clarification.

		Set<Toppin> toppins1 = new HashSet<>();
		for (String toppin : toppins) {
			toppins1.add(ToppinFactory.newToppin(toppin));
		}
		return build(BaseFactory.newBase(base),
				MainIngredientFactory.newMainIngredient(main), toppins1);

	}

	public Pizza build(Base base, Main main, Set<Toppin> toppins) {
		Pizza pizza = null;
		// add some validation on all categories and use user defined exception
		// for more clarification.
		pizza = new Pizza(base, main, toppins);
		return pizza;

	}
}
