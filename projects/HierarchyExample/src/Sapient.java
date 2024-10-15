
public class Sapient {
	//Attributes
	private int age;
	private String name;
	private boolean enjoysScrabble;
	
	//Constructor
	public Sapient(int age, String name, boolean enjoysScrabble) {
		this.age = age;
		this.name = name;
		this.enjoysScrabble = enjoysScrabble;
	}
	
	//Getters
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	
	//Setters
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
}
