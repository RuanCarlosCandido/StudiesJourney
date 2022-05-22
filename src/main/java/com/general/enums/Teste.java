package com.general.enums;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Teste {

	enum PizzaSize {
		SMALL(6.0, 0.5), MEDIUM(9.0, 1.0), LARGE(12.0, 1.5);

		private final double radius;
		private final double thickness;

		private PizzaSize(double radius, double thickness) {
			this.radius = radius;
			this.thickness = thickness;
		}

		public double getRadius() {
			return radius;
		}

		public double getThickness() {
			return thickness;
		}

		public double volume() {
			return Math.PI * radius * radius * thickness;
		}
	};

	PizzaSize size;

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");
		Teste pizza = new Teste();
		System.out.print("Enter pizza size (small, medium, large): ");
		Scanner s = new Scanner(System.in);
		pizza.size = PizzaSize.valueOf(s.next().toUpperCase());
		System.out.println("You selected " + pizza.size + " Pizza");
		System.out.println("Radius " + pizza.size.getRadius() + " inches");
		System.out.println("Thickness " + pizza.size.getThickness() + " inches");
		System.out.println("Volume " + df.format(pizza.size.volume()) + " cu. inches");
		s.close();

	}
}
