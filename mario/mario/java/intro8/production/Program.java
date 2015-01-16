package mario.java.intro8.production;
import java.util.ArrayList;

import mario.java.intro8.classes.*;
public class Program {

	public static void main(String[] args) {
		String[] names = {"Sharo", "Pesho", "Gosho", "Mimi"};
		String[] colors = {"white", "yellow", "black", "grey"};
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		
		for (int i = 0; i < 10; i++) {
			Dog dogInstance = new Dog();
			int name = (int) (Math.random() * 4);
			int color = (int) (Math.random() * 4);
			dogInstance.setName(names[name]);
			dogInstance.setColor(colors[color]);
			dogs.add(dogInstance);
		}
		for (Dog dog : dogs) {
			System.out.println(dog.toString());
		}
	}
}
