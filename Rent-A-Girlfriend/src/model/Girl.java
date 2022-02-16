package model;

public class Girl {

	private String name;
	private int age;
	private String race;
	private String nationality;
	private String hair;
	private String eyes;
	private int index;
	
	public Girl(String name, int age, String race, String nationality, String hair, String eyes, int index)
	{
		this.name = name;
		this.age = age;
		this.race = race;
		this.nationality = nationality;
		this.hair = hair;
		this.eyes = eyes;
		this.index = index;
	}
	
	@Override
	public String toString() {
		return "Girl [name=" + name + ", age=" + age + ", race=" + race + ", nationality=" + nationality + ", hair="
				+ hair + ", eyes=" + eyes + ", index=" + index + "]";
	}

	public String getRace() { return race; }
	
	
	public String getHair() { return hair; }
	
	
	public int getAge() { return age; }
	
	public String getNationality() { return nationality; }
}