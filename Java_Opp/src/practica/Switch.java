package practica;


public class Switch {
	
	
	//switch
	
	public static void main(String []args) {
		String day = "Monday";
		
		int count = 3;
		
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
		}
					
		System.out.println(value);
		
	}

}

