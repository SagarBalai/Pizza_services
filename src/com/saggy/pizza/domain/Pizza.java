package com.saggy.pizza.domain;

import java.util.Set;

public class Pizza implements Ingredient {

	private Main main;
	private Base base;
	private Set<Toppin> toppins;

	public Pizza(Base base, Main main, Set<Toppin> toppins) {
		this.base = base;
		this.main = main;
		this.toppins = toppins;
	}

	@Override
	public double calculatePrize() {
		double prize = 0.0;
		prize += main.calculatePrize();
		prize += base.calculatePrize();
		for (Toppin toppin : toppins) {
			prize += toppin.calculatePrize();
		}
		return prize;
	}

	@Override
	public String describe() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nCreating Pizza \n===================================");
		sb.append("\n" + base.describe());
		sb.append("\n" + main.describe());
		sb.append("\nAdding Toppins :");
		for (Toppin toppin : toppins) {
			sb.append(toppin.describe());
			sb.append(",");
		}
		sb.append("\n-----------------------------------");
		sb.append("\nPrize:" + calculatePrize());

		sb.append("\n=====================================");
		return sb.toString().substring(0, sb.toString().length() - 2);
	}
}
