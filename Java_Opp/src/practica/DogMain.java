package practica;

public class DogMain {
	public static void main(String []args) {
		Dog dog = new Dog("Aktos", 2, "Bek");
		System.out.println(dog);
		
		
		dog.setAge(-1);
		System.out.println(dog);
		
		System.out.println(dog.getAge());
	}

}
