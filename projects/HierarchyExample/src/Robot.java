
public class Robot extends Sapient {
	//Attributes
	private String model;

	//Constructor
	public Human(int age, String name, boolean enjoysScrabble, String model) {
		super(age, name, enjoysScrabble);
		this.model = model;
	}

	//Getters
	public String getModel() {
		return model;
	}

	//Setters
	public void setModel(String model) {
		this.model = model;
	}
}
