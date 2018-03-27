package com.saggy.pizza.test;

import static org.junit.Assert.fail;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import com.saggy.pizza.PizzaServices;
import com.saggy.pizza.domain.Pizza;
import com.saggy.pizza.services.PizzaServicesImpl;

public class TestPizza {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testFirstvariety() {
		PizzaServices services = new PizzaServicesImpl();
		Set<String> toppins = new HashSet<>();
		toppins.add("cheese");
		toppins.add("egg");
		Pizza pizza = services.createPizza("bread", "paneer", toppins);
		System.out.println(pizza.describe());

		double actualPrize = services.calcualtePrize(pizza);
		System.out.println("Actual Prize :" + actualPrize);
	}
}
