package org.general.Lists;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * @author Ruan Average time of execution of each type of iteration over an LIST
 *         (with 1000x testing)
 */
public class ExecutionTime {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		long startTime;
		long endTime;
		for (int i = 0; i < 1000000; i++) {
			list.add(i);
		}

		double somaTipo1 = 0;
		double somaTipo2 = 0;
		double somaTipo3 = 0;
		double somaTipo4 = 0;
		int z = 0;
		double limite = 1000;
		while (z < limite) {

			// TESTE desconsiderar para analise
			startTime = Calendar.getInstance().getTimeInMillis();
			for (int i : list) {
				int a = i;
			}
			endTime = Calendar.getInstance().getTimeInMillis();

			// Type 3
			startTime = Calendar.getInstance().getTimeInMillis();
			int size = list.size();
			for (int j = 0; j < size; j++) {
				int a = list.get(j);
			}
			endTime = Calendar.getInstance().getTimeInMillis();
			somaTipo3 += endTime - startTime;

			// Type 1
			startTime = Calendar.getInstance().getTimeInMillis();
			for (int i : list) {
				int a = i;
			}
			endTime = Calendar.getInstance().getTimeInMillis();
			somaTipo1 += endTime - startTime;

			// Type 2
			startTime = Calendar.getInstance().getTimeInMillis();
			for (int j = 0; j < list.size(); j++) {
				int a = list.get(j);
			}
			endTime = Calendar.getInstance().getTimeInMillis();
			somaTipo2 += endTime - startTime;

			// Type 4
			startTime = Calendar.getInstance().getTimeInMillis();
			for (int j = list.size() - 1; j >= 0; j--) {
				int a = list.get(j);
			}
			endTime = Calendar.getInstance().getTimeInMillis();
			somaTipo4 += endTime - startTime;

			System.out.println("Step" + z);
			z++;

		}

		System.out.println("For each loop :: " + somaTipo1 / limite + "ms");
		System.out.println("Using collection.size() :: " + somaTipo2 / limite + "ms");
		System.out.println("By calculating collection.size() first :: " + somaTipo3 / limite + "ms");
		System.out.println("Using [int j = list.size(); j > size ; j--] :: " + somaTipo4 / limite + "ms");

	}

}
