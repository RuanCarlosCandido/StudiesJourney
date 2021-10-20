package com.contactbook;

public class Contact {
	private String name;
	private String telephone;
	private String email;
	private int id;
	private static int counter = 0;

	public Contact() {
		counter++;
		id = counter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Contact " + (name != null ? "name=" + name + ", " : "")
		+ (telephone != null ? "telephone=" + telephone + ", " : "")
		+ (email != null ? "email=" + email + ", " : "") + "id=" + id;
	}

}
