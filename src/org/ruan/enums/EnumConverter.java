package org.ruan.enums;

public interface EnumConverter<E extends Enum<E> & EnumConverter<E>> {

	public String convert();

	E convert(String pKey);

}
