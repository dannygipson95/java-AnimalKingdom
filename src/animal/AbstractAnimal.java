package animal;

abstract class AbstractAnimal{
	protected static int idNum = 0;
	protected int animalId = idNum;
	protected String name;
	protected int year;
	protected String classification;

	protected String consume(){
		return name + " ate food!";
	}

	abstract String move();
	abstract String breathe();
	abstract String reproduce();
	abstract String getName();
	abstract int getYear();
	abstract String getClassification();

	public AbstractAnimal(){
		idNum++;
	}

	@Override
	public String toString(){
		return "\nid: " + animalId + ", name: " + name + ", yearNamed: " + year;
	}
}