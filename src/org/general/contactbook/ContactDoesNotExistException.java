package org.general.contactbook;

public class ContactDoesNotExistException extends Exception {

	private static final long serialVersionUID = 1L;

	public ContactDoesNotExistException() {

	}

	@Override
	public String toString() {
		return "ContactDoesNotExist";
	}

}
