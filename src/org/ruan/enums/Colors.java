package org.ruan.enums;

import java.util.HashMap;
import java.util.Map;

public enum Colors {

	BLUE("blue"), YELLOW("yellow"), WHITE("white"), BLACK("black"), GREEN("green"), BROWN("brown");

	Object o;
	static Map<Colors, Object> map = new HashMap<Colors, Object>();

	Colors(Object o) {
		this.o = o;
	}

	static {
		Colors[] values = Colors.values();
		int ammountValues = values.length;

		if (map.isEmpty()) {
			for (int i = 0; i < ammountValues; i++) {
				map.put(values[i], values[i].getValue());
			}
		}

	}

	Object getValue() {
		return o;
	}

	static Object valueOf(Colors c) {
		return map.get(c);
	}

}
