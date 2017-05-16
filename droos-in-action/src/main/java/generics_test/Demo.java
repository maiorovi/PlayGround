package generics_test;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<Animal> animal = new ArrayList<Animal>();
		List<?> catsWildCard = (List<?>) animal;
		List<Cat> cats = (List<Cat>)catsWildCard;
		cats.add(new Cat("name"));

		List<Bird> birds = (List<Bird>) catsWildCard;
		birds.add(new Bird());

		System.out.println(birds.get(0));
		List<? extends Animal>  objects = new ArrayList<>();
		List<Animal> newBirds = (List<Animal>) objects;
		newBirds.add(new Cat("at"));
	}
}
