package entities;

public class Apprentice {
	
	private String surname;
	private String name;
	private String formingdirection; //e. g. "Fachinformatiker"
	private String specialization; //e. g. "FISI"
	private int yoa; //year of apprenticeship
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getFormingdirection() {
		return formingdirection;
	}
	
	public void setFormingdirection(String formingdirection) {
		this.formingdirection = formingdirection;
	}
	
	public String getSpecialization() {
		return specialization;
	}
	
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	public int getYoa() {
		return yoa;
	}
	
	public void setYoa(int yoa) {
		this.yoa = yoa;
	}

	public Apprentice(String surname, String name, String formingdirection, String specialization, int yoa) {
		
		super();
		this.surname = surname;
		this.name = name;
		this.formingdirection = formingdirection;
		this.specialization = specialization;
		this.yoa = yoa;
		
	}
	
	public Apprentice() {
		super();
	}
	
}