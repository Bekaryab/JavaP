package practica;

import java.util.ArrayList;

public class ArrayMassiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("pizza");	
		food.add("Sandvich");
		food.add("chiken");
		
		
//		food.set(0, "suchi");  //поменят пицца на суши 
//		
//		
//		food.remove(0); //удалить 
//		
//		food.clear();  //очистить массив 
		
//		for (int i = 0; i < food.size(); i++) {
//			System.out.println(food.get(i));
//		}
		
		for (String i : food) {
			System.out.println(i);
		}
		
		
		
		
		//В угловых скобках желательно указать тип хранимых значений. В примере выше — String.
		//В качестве параметра конструктора выступает значения начального размера внутреннего массива.


		ArrayList<String> cats = new ArrayList<>(10000);
		

	}

}
