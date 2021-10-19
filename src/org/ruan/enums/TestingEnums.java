package org.ruan.enums;

public class TestingEnums {

	public static void main(String[] args) {
		
		Communication<PersonalInfo> comm = new Communication<PersonalInfo>(PersonalInfo.MEU_NOME);
		System.out.println(comm.resolveEnumToStringValue(PersonalInfo.MEU_NOME));
		System.out.println(comm.resolveStringEnumConstant("Ruan Carlos Candido Da Silva Lima"));
		
	}

}
