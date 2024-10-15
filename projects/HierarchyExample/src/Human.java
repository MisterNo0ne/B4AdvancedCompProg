
public class Human extends Sapient {
	//Attributes
	private String home;

	//Constructor
	public Human(int age, String name, boolean enjoysScrabble, String home) {
		super(age, name, enjoysScrabble);
		this.home = home;
	}

	//Getters
	public String getHome() {
		return home;
	}

	//Setters
	public void setHome(String home) {
		this.home = home;
	}
}
