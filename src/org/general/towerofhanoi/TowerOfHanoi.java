package com.towerofhanoi;

import java.util.Stack;

public class TowerOfHanoi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stack<Integer> original = new Stack<Integer>();
		Stack<Integer> auxiliar = new Stack<Integer>();
		Stack<Integer> destiny = new Stack<Integer>();

		original.push(4);
		original.push(3);
		original.push(2);
		original.push(1);

		HanoiTower(original.size(), original, destiny, auxiliar);
	}

	public static void HanoiTower(int numDiscs, Stack<Integer> original,
			Stack<Integer> destiny, Stack<Integer> auxiliar) {

		if (numDiscs > 0) {
			HanoiTower(numDiscs - 1, original, auxiliar, destiny);
			destiny.push(original.pop());
			System.out.println("----------");
			System.out.println("original :" + original);
			System.out.println("auxiliar : " + auxiliar);
			System.out.println("destiny :" + destiny);
			HanoiTower(numDiscs - 1, auxiliar, destiny, original);

		}
	}

}
