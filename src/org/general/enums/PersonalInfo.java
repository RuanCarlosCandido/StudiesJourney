package org.general.enums;

public enum PersonalInfo implements EnumConverter<PersonalInfo> {

	MEU_NOME("Ruan Carlos Candido Da Silva Lima"),
	NOME_ESPOSA("VITORIA MARIA");
	
	// MINHA_IDADE(28), MEU_SALARIO(2970.00), ESTOU_CASADO(true), SEXO('M');

	
	private static ReverseEnumMap<PersonalInfo> map = new ReverseEnumMap<>(PersonalInfo.class);

	String value;

	PersonalInfo(String value) {
		this.value = value;
	}

	public Object getInfo() {

		return value;
	}

	String value() {
		return this.value;
	}

	@Override
	public String convert() {

		return this.value;
	}

	@Override
	public PersonalInfo convert(String pKey) {
		return map.get(pKey);
	}

}
