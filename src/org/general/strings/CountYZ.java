package com.strings;

public class CountYZ {

	/**
	 * Given a string, count the number of words ending in 'y' or 'z' -- so the
	 * 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow"
	 * (not case sensitive). We'll say that a y or z is at the end of a word if
	 * there is not an alphabetic letter immediately following it.
	 */
	public static void main(String[] args) {
		System.out.println(countYZ("fez day"));// should output 2
		System.out.println(countYZ("day fez"));// should output 2
		System.out.println(countYZ("aaz yyz my"));// should output 3
		System.out.println(countYZ("day yak"));// should output 1
		System.out.println(countYZ("day:yak"));// should output 1
		System.out.println(countYZ("!!day--yaz!!"));// should output 2
		System.out.println(countYZ("yak zak"));// should output 0
		System.out.println(countYZ("y2bz"));// should output 2
	}

	public static int countYZ(String str) {

		String[] array = new String[str.length()];// to apply the .matches
		String aux = ""; // to build a derived string from str

		for (int i = 0; i < str.length(); i++) {
			array[i] = "" + str.charAt(i);
			if (isLetter(array, i)) {
				aux += array[i];
			} else if (!isLetter(array, i)) {
				aux += "x"; // to separate the words,latter its going to be
				// erased
			}
		}

		String[] splitString = aux.split("x"); // erase the separator
		int cont = 0;

		for (int i = 0; i < splitString.length; i++) {
			if (splitString[i].length() > 0) {
				if (splitString[i].indexOf('y') == splitString[i].length() - 1
						|| splitString[i].indexOf('z') == splitString[i]
								.length() - 1
						|| splitString[i].indexOf('Y') == splitString[i]
								.length() - 1
						|| splitString[i].indexOf('Z') == splitString[i]
								.length() - 1) {
					cont++;
				}
			}
		}
		return cont;
	}

	// to verify if some chars are Letters
	public static boolean isLetter(String[] array, int index) {
		if (array[index].matches("\\p{L}")) {
			return true;
		}
		return false;
	}

}
