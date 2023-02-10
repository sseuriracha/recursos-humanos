package co.edu.unbosque.model;

import java.io.Serializable;

public class CandidateDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String lastname;
	private String id;
	private String position;
	private int age;
	
	public CandidateDTO(String name, String lastname, String id, String position, int age) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.id = id;
		this.position = position;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Candidate [name=" + name + ", lastname=" + lastname + ", id=" + id + ", position=" + position
				+ ", age=" + age + "]\n";
	}
	
	
	
	

}
