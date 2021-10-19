package org.ruan.enums;

import java.util.HashMap;
import java.util.Map;

public enum Letters {

	A(1), B(2), C(3), D(4), E(5), F(6), G(7), H(8), I(9), J(10);

	Integer value = 0;
	static Map<Letters, Object> map = new HashMap<Letters, Object>();

	Letters(Integer value) {
		this.value = value;
	}

	static {
		Letters [] values = Letters.values();
		int ammountValues = values.length;

		if (map.isEmpty()) {
			for (int i = 0; i < ammountValues; i++) {
				map.put(values[i], values[i].getValue());
			}
		}
	
	}

	Integer getValue() {
		return value;
	}

	static Object valueOf(Letters l) {
		return map.get(l);
	}

}
