package com.saggy.pizza;

import java.util.Set;

import com.saggy.pizza.domain.Pizza;

public interface PizzaServices {
	Pizza createPizza(String base, String main, Set<String> toppins);

	double calcualtePrize(Pizza pizza);
}
