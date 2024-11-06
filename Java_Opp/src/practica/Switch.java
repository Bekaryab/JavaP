package practica;


public class Switch {
	
	
	//switch
	
	public static void main(String []args) {
		String day = "Monday";
		
		int count = 1;
		
		int value;
		
		
		switch(day) {
			case "Synday": System.out.println("Today Sunday");
			break;
			case "Monday": System.out.println("Today is Monday");
			break;
		default:
			System.out.println("Oooiii kate goi");
			
			
		}
		
		
		//switch count 
		switch(count) {
			case 3:
				value = 4;
				break;
			case 1:
				value = 2;
				break;
			case 2:
				value = 3;
				break;
			default:
				value = 0;
				
				//Не забывайте завершать логический блок каждой ветки соответствующего конкретному значению (блок case) вызовом break.
		}
					
		System.out.println(value);
		
		
		
		//3 primer
		
		int cou = 1;
		int val = switch(cou) {
		case 1 -> 10;
		case 2 -> 20;
		default -> 0;
		
		}
		
		System.out.println(val);
		
		
		
		//4 primer
		// yield на этом версие не работает yield == return 
		switch(count) {
			case 1:
				yield 12;
			case 2:
				yield 13;
			default:
				yield 0;
			};
		
		System.out.println(value);
		
		
	}

}

