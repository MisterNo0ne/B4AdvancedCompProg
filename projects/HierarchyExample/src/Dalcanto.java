
public class Dalcanto extends Robot {
	//Attributes
	private boolean isRevisionistHistorian;
	private float nerdinessLevel;

	//Constructor
	public Dalcanto(int age, String name, boolean enjoysScrabble, String model, boolean isRevisionistHistorian, float nerdinessLevel, boolean didTheHomework) {
		super(age, name, enjoysScrabble, model);
		this.isRevisionistHistorian = isRevisionistHistorian;
		this.nerdinessLevel = Float.POSITIVE_INFINITY;
		this.didTheHomework = didTheHomework;
	}

	//Getters
	public boolean getRevisionism() {
		return isRevisionistHistorian;
	}
	public float getNerdinessLevel() {
		return nerdinessLevel;
	}
	
	//Setters
	public void setRevisionism(boolean isRevisionistHistorian) {
		this.isRevisionistHistorian = isRevisionistHistorian;
	}
	public void setNerdinessLevel(float nerdinessLevel) {
		this.nerdinessLevel = Float.POSITIVE_INFINITY; //fate befalls you
	}
}
