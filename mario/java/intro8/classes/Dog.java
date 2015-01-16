package mario.java.intro8.classes;

public class Dog {

	private String name;
	private String color;

	public Dog() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void run() {
		System.out.println("I am running! Catch me if you can");
	}
	
	public void fetch() {
		System.out.println("fetch");
	}
	
	public void sit() {
		System.out.println("and I am sitting");
	}

	@Override
	public String toString() {
		return "I am " + getName() + " and I am a " + getColor() + " dog";
	}
}
