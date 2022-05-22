package com.general.annotations;

public class AnnotationsTest {

	public static void main(String[] args) {

		Person p = new Person();
		p.setAddress("rua tal");
		p.setAge("27");
		p.setFirstName("RUAn");
		p.setLastName("Candido");
		
		Processing processing = new Processing();
		
		try {
			System.out.println(processing.convertToJson(p));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
