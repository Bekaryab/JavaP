package practica;

public class Cars {
	public static void main(String []args) {
		Car car = new Car("Tesla", 400);
		Car car2 = new Car("Камаз", 120);
		car.inSpeed();
		car2.inSpeed();
		
		Garag garag =  new Garag();
			garag.setCar1(car);
			garag.setCar2(car2);
		
	}

}
