package org.ruan.Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class mapMethods {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();

		for (int i = 0; i < 10; i++) {
			map.put(i, (i * 2 + ""));
			System.out.println(map.get(i));

		}
		System.out.println(map.get(15));

		System.out.println(map);

		map.merge(15, "usando Merge", String::concat);
		System.out.println(map.get(15));

		map.merge(16, "usando outro Merge", (oldValue, newValue) -> oldValue + "/" + newValue);
		System.out.println(map.get(16));

		map.merge(16, "usando outro Merge", (oldValue, newValue) -> oldValue + "/" + newValue);
		System.out.println(map.get(16));

		map.merge(17, "abc", (oldValue, newValue) -> {
			if (newValue.equalsIgnoreCase("abc")) {

				return newValue;
			} else {
				return oldValue;
			}
		});

		System.out.println(map.get(17));

		System.out.println(map.containsKey(1));
		System.out.println(map.containsKey(20));

		System.out.println(map);

		System.out.println(map.containsValue("abc"));
		System.out.println(map.containsValue("4"));
		System.out.println(map.containsValue("400"));

		Set<Entry<Integer, String>> set = map.entrySet();

		Iterator<Entry<Integer, String>> it = set.iterator();
		System.out.println("Printando o Set");
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println("\n" + map.getClass());

		Set<Integer> keySet = map.keySet();

		Iterator<Integer> ite = keySet.iterator();
		System.out.println("printando keySet");

		while (ite.hasNext()) {
			System.out.print(" " + ite.next());

		}

		Map<Integer, String> map2 = new HashMap<>();
		map2.putAll(map);

		System.out.println("\n map2 " + map2);

		map.remove(5);
		System.out.println(map);

		map.remove(1, "2");// remove
		map.remove(4, "9");// não remove
		System.out.println(map);

		
		
	}
}
