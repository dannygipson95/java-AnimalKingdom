package animal;

import java.util.ArrayList;
import java.util.List;

public class Main{
	private static List<AbstractAnimal> filterAnimal(List<AbstractAnimal> animals, CheckAnimal tester){
		List<AbstractAnimal> tempList = new ArrayList<>();

		for (AbstractAnimal a : animals){
			if (tester.test(a) == true){
				tempList.add(a);
			}
		}
		return tempList;
	}
	public static void main(String[] args){
  // | Name      | Year Named |
  //   |-----------|-------|
  //   | Panda     | 1869  |
  //   | Zebra     | 1778  |
  //   | Koala     | 1816  |
  //   | Sloth     | 1804  |
  //   | Armadillo | 1758  |
  //   | Raccoon   | 1758  |
  //   | Bigfoot   | 2021  | 

		List<AbstractAnimal> animalList = new ArrayList<>();

		Mammals panda = new Mammals("Panda", 1896);
		animalList.add(panda);

		Mammals zebra = new Mammals("Zebra", 1778);
		animalList.add(zebra);

		Mammals koala = new Mammals("Koala", 1816);
		animalList.add(koala);

		Mammals sloth = new Mammals("Sloth", 1816);
		animalList.add(sloth);

		Mammals armadillo = new Mammals("Armadillo", 1758);
		animalList.add(armadillo);

		Mammals raccoon = new Mammals("Raccoon", 1758);
		animalList.add(raccoon);

		Mammals bigfoot = new Mammals("Bigfoot", 2021);
		animalList.add(bigfoot);

		  //   | Name      | Year Named |
    // |-----------|------|
    // | Pigeon    | 1837 |
    // | Peacock   | 1821 |
    // | Toucan    | 1758 |
    // | Parrot    | 1824 |
    // | Swan      | 1758 |

		Birds pigeon = new Birds("Pigeon", 1837);
		animalList.add(pigeon);

		Birds peacock = new Birds("Peacock", 1821);
		animalList.add(peacock);

		Birds toucan = new Birds("Toucan", 1758);
		animalList.add(toucan);

		Birds parrot = new Birds("Parrot", 1824);
		animalList.add(parrot);

		Birds swan = new Birds("Swan", 1758);
		animalList.add(swan);

		  //   | Name      | Year Named |
    // |-----------|------|
    // | Salmon    | 1758 |
    // | Catfish   | 1817 |
    // | Perch     | 1758 |

		Fish salmon = new Fish("Salmon", 1758);
		animalList.add(salmon);

		Fish catfish = new Fish("Catfish", 1817);
		animalList.add(catfish);

		Fish perch = new Fish("Perch", 1758);
		animalList.add(perch);

		System.out.println("\n*** Sorted by year in descending order ***");
		animalList.sort((a1, a2) -> Integer.compare(a2.getYear(), a1.getYear()));
		System.out.println(animalList);

		System.out.println("\n*** Sorted by name ***");
		animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
		System.out.println(animalList);

		System.out.println("\n*** Sorted by movement ***");
		animalList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
		System.out.println(animalList);

		System.out.println("\n*** Animals that breathe with lungs ***");
		List<AbstractAnimal> filteredList = filterAnimal(animalList, (a) -> a.breathe() == "Lungs");
		System.out.println(filteredList);

		System.out.println("\n*** Animals the breathe with lungs and were named in 1758 ***");
		List<AbstractAnimal> moreFilteredList = filterAnimal(animalList, (a) -> a.breathe() == "Lungs" && a.getYear() == 1758);
		System.out.println(moreFilteredList);

		System.out.println("\n*** Animals that breathe with lungs and lay eggs ***");
		List<AbstractAnimal> lungEggList = filterAnimal(animalList, (a) -> a.breathe() == "Lungs" && a.reproduce() == "Eggs");
		System.out.println(lungEggList);

		System.out.println("\n*** Animals named in 1758 listed alphabetically ***");
		List<AbstractAnimal> oldAlphabetList = filterAnimal(animalList, (a) -> a.getYear() == 1758);
		oldAlphabetList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
		System.out.println(oldAlphabetList);
		
	}
}