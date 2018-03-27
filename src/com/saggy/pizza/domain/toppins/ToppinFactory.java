package com.saggy.pizza.domain.toppins;

import com.saggy.pizza.domain.Toppin;

public class ToppinFactory {
	public static Toppin newToppin(String toppinName) {
		Toppin toppin = null;
		if (toppinName.equalsIgnoreCase("egg")) {
			toppin = new Egg();
		} else if (toppinName.equalsIgnoreCase("cheese")) {
			toppin = new Cheese();
		}
		return toppin;
	}
}
