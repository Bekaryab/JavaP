package practica;
import java.util.Scanner;

public class While {
	public static void main(String []args) {
		int n = 3;
		int r = 1;
		int p = 1;
		
		while (p <= 10) {
			r  = r * n;
			System.out.println(n + " в степени " + p + " = " + r);
	        p++;
		}
		
		 
		
		// do 
		do {
			
			System.out.println(n + " в степени " + p + " = " + r);
			p++;
			r  = r* n;
		}while(p <= 10);
		
		
		
		Scanner sc = new Scanner(System.in);
		
		String name = "";
		
		while(name.isBlank()) {
			System.out.println("enter your name:");
			name = sc.nextLine();
		}
		System.out.println("Hello " + name);
	}
}
