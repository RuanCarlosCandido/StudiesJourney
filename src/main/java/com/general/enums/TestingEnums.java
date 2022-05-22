package com.general.enums;

import java.util.Arrays;

public class TestingEnums {

	public static void main(String[] args) {
		
		Colors a = Arrays.stream(Colors.values())
        .findFirst().get();
		
		System.out.println(a);
		
		Communication<PersonalInfo> comm = new Communication<PersonalInfo>(PersonalInfo.MEU_NOME);
		System.out.println(comm.resolveEnumToStringValue(PersonalInfo.MEU_NOME));
		System.out.println(comm.resolveStringEnumConstant("Ruan Carlos Candido Da Silva Lima"));
		
	}

}
