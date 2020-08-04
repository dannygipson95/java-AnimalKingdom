package animal;

public class Fish extends AbstractAnimal{
	public Fish(String name, int year){
		this.name = name;
		this.year = year;
		this.classification = "Fish";
	}

	@Override
	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	@Override
	public int getYear(){
		return year;
	}

	public void setYear(int year){
		this.year = year;
	}

	@Override
	public String getClassification(){
		return classification;
	}

	public void setClassification(String classification){
		this.classification = classification;
	}

	@Override
	public String move(){
		return "Swim";
	}

	@Override
	public String breathe(){
		return "Gills";
	}

	@Override
	public String reproduce(){
		return "Eggs";
	}
}