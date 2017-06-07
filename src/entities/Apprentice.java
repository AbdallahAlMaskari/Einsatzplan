package entities;

public class Apprentice {
	
	private String surname;
	private String name;
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

	public Apprentice(String surname, String name, String specialization, int yoa) {
		
		super();
		this.surname = surname;
		this.name = name;
		this.specialization = specialization;
		this.yoa = yoa;
		
	}
	
	public Apprentice() {
		super();
	}
	
}