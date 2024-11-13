package practica;

public class Array2D {
	public static void main(String []args) {
		String [][] cars = new String[3][3];
		// устанавливаем значения элементов массива
		cars[0][0] = "Cmmaro";
		cars[0][1] = "Corvette";
		cars[0][2] = "Mustang";
		cars[1][0] = "Cmmaro";
		cars[1][1] = "Corvette";
		cars[1][2] = "Mustang";
		cars[2][0] = "Cmmaro";
		cars[2][1] = "Corvette";
		cars[2][2] = "Mustang";
		
		
		for (int i = 0; i < cars.length; i++) {
			System.out.println();
			for (int j = 0; j < cars.length; j++) {
				System.out.println(cars[i][j]);
			}
		}
		
		
		
		
		
		String[][] car = {{"cmasro", "mustang", "Corvette"}, {"cmasro", "mustang", "Corvette"}};
		
		for (int i = 0; i < car.length; i++) {
			System.out.println();
			for (int j = 0; j < car.length; j++) {
				System.out.println(car[i][j]);
			}
		}
		
		//то же самое
		for (String[] i : car) {
			System.out.println();
			for(String j : i) {
				System.out.println(j);
			}
		}
		
		
		
		
		
		
		
		int[][] nums = new int[3][];
		nums[0] = new int[2];
		nums[1] = new int[3];
		nums[2] = new int[5];

		
		
		
//		Для i = 0:
//
//			nums[0].length = 2, значит, j принимает значения 0 и 1.
//			При j = 0: nums[0][0] = 0 + 0 = 0.
//			При j = 1: nums[0][1] = 0 + 1 = 1.
//			После выполнения первой строки nums[0] станет [0, 1].
//			Для i = 1:
//
//			nums[1].length = 3, значит, j принимает значения 0, 1, и 2.
//			При j = 0: nums[1][0] = 1 + 0 = 1.
//			При j = 1: nums[1][1] = 1 + 1 = 2.
//			При j = 2: nums[1][2] = 1 + 2 = 3.
//			После выполнения второй строки nums[1] станет [1, 2, 3].
//			Для i = 2:
//
//			nums[2].length = 5, значит, j принимает значения 0, 1, 2, 3, и 4.
//			При j = 0: nums[2][0] = 2 + 0 = 2.
//			При j = 1: nums[2][1] = 2 + 1 = 3.
//			При j = 2: nums[2][2] = 2 + 2 = 4.
//			При j = 3: nums[2][3] = 2 + 3 = 5.
//			При j = 4: nums[2][4] = 2 + 4 = 6.
//			После выполнения третьей строки nums[2] станет [2, 3, 4, 5, 6].
//		 Заполнение массива
		for (int i = 0; i < nums.length; i++) {
		    for (int j = 0; j < nums[i].length; j++) {
		        nums[i][j] = i + j; // Пример значения
		    }
		}

		// Вывод массива
		for (int i = 0; i < nums.length; i++) {
		    for (int j = 0; j < nums[i].length; j++) {
		        System.out.print(nums[i][j] + " ");
		    }
		    System.out.println();
		}
		
		
		
		
		
		int [] arr = new int[] {1,2,3,4,5};
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * 2;
			System.out.println(arr[i]);
		}
		
		

	}

}
