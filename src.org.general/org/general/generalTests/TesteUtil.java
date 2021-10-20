package org.general.generalTests;

import java.util.Arrays;

import org.general.util.Util;

public class TesteUtil {

	public static void main(String[] args) {

		char c = 'a';
		int i = 2;
		short s = 2;
		float f = 3f;
		double d = 5.0;
		long l = 7l;
		boolean b = true;
		byte b1 = 1;

		Util.printClassName(c);
		Util.printClassName(i);
		Util.printClassName(s);
		Util.printClassName(f);
		Util.printClassName(d);
		Util.printClassName(l);
		Util.printClassName(b);
		Util.printClassName(b1);

		Class<TesteUtil> a = TesteUtil.class;
		System.out.println(a.getPackage());
		System.out.println(Arrays.toString(a.getInterfaces()));

	}

}
