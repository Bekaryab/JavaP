package practica;

import java.util.Scanner;

public class Logic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Press q or Q to qiut");
		
		String a = sc.next();
		
		
		//or -> || operations
		
		if(a.equals("q") || a.equals("Q")) {
			System.out.println("You quit the game");
		}
		else {
			System.out.println("You are still playing the game");
		}
		
		
		if(!a.equals("q") && !a.equals("Q")) {
			System.out.println("You quit the game");
		}
		else {
			System.out.println("You are still playing the game");
		}
	}

}

