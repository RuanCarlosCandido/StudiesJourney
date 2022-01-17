package org.general.apiGeneral;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.json.simple.JSONObject;

@Entity
@Table(name = "people_in_space")
public class Astronaut {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ID;
	private String name;
	private String craft;
	private Timestamp response_date = Timestamp.valueOf(LocalDateTime.now());

	public Astronaut() {
	}

	public Astronaut(JSONObject jso ) {
		this.name = (String) jso.get("name");
		this.craft = (String) jso.get("craft");
	}
	
	public Astronaut(String name, String craft) {
		this.name = name;
		this.craft = craft;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCraft() {
		return craft;
	}

	public void setCraft(String craft) {
		this.craft = craft;
	}

	public Timestamp getResponse_date() {
		return response_date;
	}

	public void setResponse_date(Timestamp response_date) {
		this.response_date = response_date;
	}

	@Override
	public String toString() {
		return "ID=" + ID + ", " + (name != null ? "name=" + name + ", " : "")
				+ (craft != null ? "craft=" + craft + ", " : "")
				+ (response_date != null ? "response_date=" + response_date : "");
	}

}
