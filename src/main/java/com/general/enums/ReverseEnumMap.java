package com.general.enums;

import java.util.HashMap;
import java.util.Map;

public class ReverseEnumMap<V extends Enum<V> & EnumConverter<V>> {

	private Map<String, V> map = new HashMap<String, V>();

	public ReverseEnumMap(Class<V> valueType) {
		for (V v : valueType.getEnumConstants()) {
			map.put(v.convert(), v);
		}
	}

	public V get(String pKey) {
		return map.get(pKey);
	}

}
