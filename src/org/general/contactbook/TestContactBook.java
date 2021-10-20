package org.general.contactbook;

import java.util.Scanner;

import com.sun.istack.internal.logging.Logger;

public class TestContactBook {

	public static final Logger LOG = Logger.getLogger(TestContactBook.class);

	public static ContactBook conBook = new ContactBook(2);

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean end = false;
		do {
			switch (getUserChoice(scan)) {
			case 1:
				consultContact();
				break;
			case 2:
				addContact();
				break;
			default:
				end = true;
				break;
			}
		} while (!end);
	}

	public static void showsMenu() {
		StringBuilder userMenu = new StringBuilder();
		userMenu.append("Type 1 to consult a contact \n");
		userMenu.append("Type 2 to add a contact \n");
		userMenu.append("Type 0 to exit");
		System.out.println(userMenu);

	}

	public static int getUserChoice(Scanner scan) {

		String s = "";
		boolean validInput = false;
		int userChoice = 0;

		while (!validInput) {
			showsMenu();
			try {
				s = scan.nextLine();
				userChoice = Integer.parseInt(s);

				if (userChoice >= 0 && userChoice <= 2) {
					validInput = true;
				}
			} catch (NumberFormatException e) {
				LOG.warning(e.toString());
				// System.out.println("InvalidInput");
			}
		}
		return userChoice;
	}

	public static String readName() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Contact name: ");
		return scan.next();
	}

	public static String readTelephone() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Contact telephone: ");
		return scan.next();
	}

	public static String readEmail() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Contact email: ");
		return scan.next();
	}

	public static void addContact() {
		Contact contact = new Contact();
		contact.setName(readName());
		contact.setEmail(readEmail());
		contact.setTelephone(readTelephone());
		conBook.addContact(contact);
	}

	public static void consultContact() {

		Scanner scan = new Scanner(System.in);
		String name = "";

		System.out.println("Type the contact name: ");

		name = scan.next();

		if (conBook.consultContact(name) != null) {
			System.out.println(conBook.consultContact(name));
		}
	}

}
