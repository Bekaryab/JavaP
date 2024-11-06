package practica;

public class Main {
	public static void main(String []args) {
		Cat cat = new Cat("Black", 10, "Cat", "Bek");
		System.out.println(cat.color);
		System.out.println(cat.weight);
		System.out.println(cat.nameCat);
		System.out.println(cat.ownerCat);
		cat.color  = "Blue";
		System.out.println(cat.color);
		
		cat.bek();
		String r = cat.hunt();
		
		System.out.println(r);
		
		String rr = cat.hunt(true, false);
		
		System.out.println(rr);
		
		cat.fff("sfsef", "svrr", "iii");
		
		
	}
}
