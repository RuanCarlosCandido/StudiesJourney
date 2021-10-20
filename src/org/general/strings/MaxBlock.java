package com.strings;

public class MaxBlock {

	/**
	 * 
	 Given a string, return the length of the largest "block" in the string. A
	 * block is a run of adjacent chars that are the same
	 */
	public static void main(String[] args) {
		System.out.println(maxBlock("abbCCCddBBBxx"));// should output 3
		System.out.println(maxBlock(""));// should output 0
		System.out.println(maxBlock("abbbcbbbxbbbx"));// should output 3
		System.out.println(maxBlock("XXBBBbbxx"));// should output 3
		System.out.println(maxBlock("XXBBBBbbxx"));// should output 4
		System.out.println(maxBlock("XX2222BBBbbXX2222"));// should output 4
	}

	public static int maxBlock(String str) {
		int cont = 0;
		int[] contadores = new int[str.length()];
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) { // menor bloco possivel
					cont++;
				} else {
					break;
				}

				contadores[i] = cont;
			}
			cont = 0;
		}
		int max = 0;

		for (int i = 0; i < contadores.length; i++) {

			if (contadores[i] > max) {
				max = contadores[i];
			}
		}

		return max;

	}
}
