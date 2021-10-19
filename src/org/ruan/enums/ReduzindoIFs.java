package org.ruan.enums;

import static org.ruan.enums.Letters.*;

public class ReduzindoIFs {

	public static void main(String[] args) {

		String letter = "C";
		String Letter2 = String.valueOf(D);
		
		
		if (letter == "A")
			System.out.println(1);
		else if (letter == "B")
			System.out.println(2);
		else if (letter == "C")
			System.out.println(3);
		else if (letter == "D")
			System.out.println(4);
		else if (letter == "E")
			System.out.println(5);
		else if (letter == "F")
			System.out.println(6);
		else if (letter == "G")
			System.out.println(7);
		else if (letter == "H")
			System.out.println(8);
		else if (letter == "I")
			System.out.println(9);
		else if (letter == "J")
			System.out.println(10);

		
		method(A);
		
	}

	static void method(Letters l) {
		
		System.out.println(valueOf(l));
		
	}

	
	
}
