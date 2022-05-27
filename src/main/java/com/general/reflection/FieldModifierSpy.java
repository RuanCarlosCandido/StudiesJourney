package com.general.reflection;

import static java.lang.System.out;
//
//import java.lang.annotation.Documented;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class FieldModifierSpy {

	public static void printModifiers(Class<?> c) {
		try {
			Field[] flds = c.getDeclaredFields();

			int searchMods = 0x0;
			for (int i = 1; i < flds.length; i++) {
				String s = flds[i].toString();
				searchMods |= modifierFromString(s.substring(0, s.indexOf(" ")));
			}

			out.format("Fields in Class '%s' containing modifiers:  %s%n", c.getName(), Modifier.toString(searchMods));

			for (Field f : flds) {
				out.format("%-8s [ synthetic=%-5b enum_constant=%-5b ]%n", f.getName(), f.isSynthetic(),
						f.isEnumConstant());
			}
		} catch (Exception x) {
			x.printStackTrace();
		}
	}

	private static int modifierFromString(String s) {
		int m = 0x0;
		if ("public".equals(s))
			m |= Modifier.PUBLIC;
		else if ("protected".equals(s))
			m |= Modifier.PROTECTED;
		else if ("private".equals(s))
			m |= Modifier.PRIVATE;
		else if ("static".equals(s))
			m |= Modifier.STATIC;
		else if ("final".equals(s))
			m |= Modifier.FINAL;
		else if ("transient".equals(s))
			m |= Modifier.TRANSIENT;
		else if ("volatile".equals(s))
			m |= Modifier.VOLATILE;
		return m;
	}

}
