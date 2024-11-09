package practica;

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
	}
}
