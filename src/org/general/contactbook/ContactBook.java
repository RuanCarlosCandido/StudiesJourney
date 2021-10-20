package org.general.contactbook;

public class ContactBook {

	private Contact[] contactsList;

	public ContactBook(int size) {
		contactsList = new Contact[size];
	}

	public void addContact(Contact contact) {
		try {
			if (isContactBookEmpty(contactsList)) {
				contactsList[contact.getId() - 1] = contact;
				System.out.println("Contact added\n");
			} else {
				throw new FullContactBookException();
			}
		} catch (FullContactBookException e) {
			System.out.println(e.toString() + "\n");
		}

	}

	private boolean isContactBookEmpty(Contact[] contactsList) {

		if (contactsList[contactsList.length - 1] == null) {
			return true;
		}
		return false;
	}

	public Contact consultContact(String name) {
		try {
			if (search(name) != -1) {
				return contactsList[search(name)];
			} else {
				throw new ContactDoesNotExistException();
			}

		} catch (ContactDoesNotExistException e) {
			System.out.println(e.toString());
		}
		return null;
	}

	public int search(String name) {

		for (int i = 0; i < contactsList.length; i++) {

			if (contactsList[i].getName().equalsIgnoreCase(name)) {
				return i;
			}

		}
		return -1;

	}
}
