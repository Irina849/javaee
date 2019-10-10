package model;

public class Actor {
	private long id;
	private String lastname;
	private String	firstname;
	private String gender;
	
	//Construtor
	public Actor(long id, String lastname, String firstname, String gender) {
		super();
		this.id = id;
		this.lastname = lastname;
		this.firstname = firstname;
		this.gender = gender;
		
	}

	public Actor() {	
		
	}
	
	// Getters setters
	
	public String getGender() {
		return gender;
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	@Override
	public String toString() {
		return "Actor [lastname=" + lastname + ", firstname=" + firstname + ", gender=" + gender +"]";
	}
	
	
	
}
