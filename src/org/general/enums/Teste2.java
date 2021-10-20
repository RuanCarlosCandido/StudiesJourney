package org.general.enums;

import static org.general.enums.Colors.*;

public class Teste2 {

	public static void main(String[] args) {

		pintar(WHITE);
		pintar(BLACK);
		
		System.out.println();

			System.out.println(valueOf(WHITE));	
						
	}

	
	static void pintar(Colors ac) {
		System.out.println("U have painted it in " + ac);
	}
	
}
