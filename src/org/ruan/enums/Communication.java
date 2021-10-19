package org.ruan.enums;

public class Communication<E extends Enum<E> & EnumConverter<E>> {

	private final E enumSample;

	public Communication(E enumSample) {
		this.enumSample = enumSample;
	}

	public String resolveEnumToStringValue(E e) {
		return e.convert();
	}

	public E resolveStringEnumConstant(String pName) {
		return enumSample.convert(pName);
	}

}
