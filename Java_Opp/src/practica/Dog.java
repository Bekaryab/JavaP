package practica;

public class Dog {
	private String name;  // здесь мы также передаюом значение 
	// вот так private String name = "bekarys"; 
	private int age;
	private String ownerName;
	
	//Блок иницилизация
	{
		System.out.println("Ит болды");
	}
	
	public Dog(String name, int age, String ownerName) {
		// здесь можно написать условный операция то есть if()
		this.name = name;
		this.age = age;
		this.ownerName = ownerName;
	}
	
	public void setAge(int newAge) {
		// set -> это функция помагает устоновлет нового значение  
		if(newAge > 0) {
			this.age = 5;
		}
		else {
			this.age = 10;
		}
	}
	
	public String getAge() {
		// просто получат значение 
		return "Age" + age;
	}
	
	@Override
    public String toString() {
		// если мы не използуем toString() то другой слова выйдет
		//practica.Dog@37a71e93
		//practica.Dog@37a71e93 <-- вот такой то есть геттер и сеттер корретно не работает
        return "Dog{name='" + name + "', age=" + age + ", ownerName='" + ownerName + "'}";
    }
	
	
	
	

}
