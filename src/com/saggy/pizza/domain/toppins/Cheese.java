package com.saggy.pizza.domain.toppins;

import com.saggy.pizza.domain.Toppin;

public class Cheese extends Toppin {
	public Cheese() {
		prize = 1.0;
	}

	@Override
	public String describe() {
		// TODO Auto-generated method stub
		return "Cheese";
	}

}
