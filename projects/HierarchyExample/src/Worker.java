
public class Worker extends Human {
	//Attributes
	private int hourlyWage;
	private int salary;
	private String occupation;

	//Constructor
	public Worker(int hourlyWage, int salary, String occupation, int age, String name, boolean enjoysScrabble, String home) {
		Super(age, name, enjoysScrabble, home);
		this.hourlyWage = hourlyWage;
		this.salary = salary;
		this.occupation = occupation;
	}

	//Getters
	public int getWage() {
		return hourlyWage;
	}

	//Setters
	public void setWage(hourlyWage) {
		this.hourlyWage = hourlyWage;
	}
	public void getARaise(raiseAmount) {
		salary += raiseAmount;
	}
}
