package practica;

import java.util.Arrays;

public class Cat {
	String color;
	double weight;
	String nameCat;
	String ownerCat;
	
	public Cat(String colorname, double weightName, String Name, String Owner) {
		this.color = colorname;
		this.weight = weightName;
		this.nameCat = Name;
		this.ownerCat = Owner;
	}
	
	public void bek() {
		System.out.println("bekarys oop");
	}
	
	public String hunt() {
		return "Мышь";
	}
	
	public String hunt(boolean isDay, boolean suc) {
		if(suc) {
			if(isDay) {
				return "Мышь";
			}
			return "сова";
		}
		return "Комары";
	}
	

	public void fff(String ...pp) {  // ...pp -> varArgs исползются последный то есть например string giver, String ...pp вот так исползуются
		// ...pp -> это как массив  
		System.out.println(Arrays.toString(pp));
	}
	
	


}
