package practica;

import java.util.ArrayList;

public class ArrayList2D {
	public static void main(String []args) {
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
		
		
		ArrayList<String> dringList = new ArrayList<>();
		dringList.add("soda");
		dringList.add("coffee");
		
		ArrayList<String> produceList = new ArrayList<>();
		produceList.add("tomatoess");
		produceList.add("pepers");
		
		ArrayList<String> bakeryList = new ArrayList<>();
		bakeryList.add("pasta");
		bakeryList.add("dounts");
		
		
		groceryList.add(dringList);
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		
		System.out.println(groceryList.get(0)); //[soda, coffee]
		
		System.out.println(groceryList.get(0).get(1)); //[coffee]
	}

}
